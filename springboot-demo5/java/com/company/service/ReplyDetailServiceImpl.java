package com.company.service;

import java.sql.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.company.dao.ReplyDetailDao;
import com.company.pojo.ReplyDetail;

@Service
public class ReplyDetailServiceImpl implements ReplyDetailService {
	@Resource
	private ReplyDetailDao replyDetailDao;

	@Override
	public ReplyDetail findById(int id) {
		return replyDetailDao.findById(id);
	}

	@Override
	public boolean insert(ReplyDetail replyDetail) {
		replyDetail.setCreatedate(new Date(System.currentTimeMillis()));
		return replyDetailDao.insert(replyDetail) > 0 ? true : false;
	}

	@Override
	public boolean delete(int id) {
		return replyDetailDao.delete(id) > 0 ? true : false;
	}

	@Override
	public boolean update(ReplyDetail replyDetail) {
		return replyDetailDao.update(replyDetail) > 0 ? true : false;
	}

}
