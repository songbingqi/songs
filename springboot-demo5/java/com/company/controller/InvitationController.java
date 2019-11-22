package com.company.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.Invitation;
import com.company.service.InvitationService;

/**
 * @author song
 * @category 控制器
 *
 */
@Controller
public class InvitationController {
	Logger log = Logger.getLogger(InvitationController.class);

	@Resource
	private InvitationService invitationService;

	// 进入首页
	@RequestMapping("/index")
	public String index() {
		System.out.println("index...");
		return "forward:/index.jsp";
	}

	// 查询所有的帖子
	@RequestMapping("/list")
	public String list(Model model) {
		log.debug("list...");
		List<Invitation> list = invitationService.find();
		model.addAttribute("list", list);
		System.out.println(list.size());
		return "list";
	}

	@RequestMapping("/add")
	public String add() {
		return "add";
	}

	@RequestMapping("/addSave")
	public String addSave(Invitation invitation) {
		log.debug("invitation.title:" + invitation.getTitle());
		boolean flag = invitationService.insert(invitation);
		log.debug("flag:" + flag);
		return "redirect:list.action";
	}

	@RequestMapping("/update")
	public String update(int id, Model model) {
		log.debug("id:" + id);
		Invitation invitation = invitationService.findById(id);
		model.addAttribute("invitation", invitation);
		return "update";
	}

	@RequestMapping("/updateSave")
	public String updateSave(Invitation invitation) {
		log.debug("invitation.title:" + invitation.getTitle());
		boolean flag = invitationService.update(invitation);
		log.debug("flag:" + flag);
		return "redirect:list.action";
	}

	@RequestMapping("/delete")
	public String delete(int[] ids) {
		log.debug("ids:" + ids);
		boolean flag = invitationService.delete(ids);
		log.debug("flag:" + flag);
		return "redirect:list.action";
	}

	@RequestMapping("/fandById")
	public String fandById(Model model, int id) {
		Invitation invitation = invitationService.findById(id);
		System.out.println("wwwww"+invitation.getTitle());
		model.addAttribute("invitation", invitation);
		return "info";

	}

}
