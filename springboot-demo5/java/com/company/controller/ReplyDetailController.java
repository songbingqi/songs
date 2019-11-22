package com.company.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.pojo.ReplyDetail;
import com.company.service.ReplyDetailService;

/**
 * @author song
 * @category 回复帖子控制器
 */
@Controller
public class ReplyDetailController {
	Logger log = Logger.getLogger(ReplyDetailController.class);
	@Resource
	private ReplyDetailService replyDetailService;

	@RequestMapping("/findById")
	public String select(Model model, int id) {
		ReplyDetail replyDetail = replyDetailService.findById(id);
		model.addAttribute("replyDetail", replyDetail);
		return "info";
	}
}
