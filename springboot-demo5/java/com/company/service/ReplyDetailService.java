package com.company.service;

import java.util.List;

import com.company.pojo.ReplyDetail;

/**
 * @author song
 * @category 回复帖子业务逻辑接口
 *
 */
public interface ReplyDetailService {
//	/**
//	 * 回复所有帖子信息
//	 * 
//	 * @return
//	 */
//	public List<ReplyDetail> findAll();

	/**
	 * 根据id回复帖子信息
	 * 
	 * @param id
	 * @return
	 */
	public ReplyDetail findById(int id);

	/**
	 * 增加一条回复帖子信息
	 * 
	 * @param replyDetail
	 * @return
	 */
	public boolean insert(ReplyDetail replyDetail);

	/**
	 * 根据id删除一条帖子信息
	 * 
	 * @param id
	 * @return
	 */
	public boolean delete(int id);

	/**
	 * 更新一条回复帖子信息
	 * 
	 * @param replyDetail
	 * @return
	 */
	public boolean update(ReplyDetail replyDetail);
}
