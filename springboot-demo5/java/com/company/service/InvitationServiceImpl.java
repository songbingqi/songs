package com.company.service;

import java.sql.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.InvitationDao;
import com.company.pojo.Invitation;

@Service
public class InvitationServiceImpl implements InvitationService {
	@Resource
	private InvitationDao invitationDao;

	@Override
	public List<Invitation> find() {
		return invitationDao.find();
	}

	@Override
	public Invitation findById(int id) {
		return invitationDao.findById(id);
	}

	@Override
	public boolean insert(Invitation invitation) {
		invitation.setCreatedate(new Date(System.currentTimeMillis()));
		return invitationDao.insert(invitation) > 0 ? true : false;
	}

	@Override
	public boolean delete(int[] ids) {
		return invitationDao.delete(ids) > 0 ? true : false;
	}

	@Override
	public boolean update(Invitation invitation) {
		return invitationDao.update(invitation) > 0 ? true : false;
	}

}
