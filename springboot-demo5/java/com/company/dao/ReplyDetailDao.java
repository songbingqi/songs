package com.company.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.pojo.ReplyDetail;

/**
 * @author song
 * @category 回复帖子业务访问接口
 *
 */
@Repository("ReplyDetailDao.xml")
public interface ReplyDetailDao {

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
	public int insert(ReplyDetail replyDetail);

	/**
	 * 根据id删除一条帖子信息
	 * 
	 * @param id
	 * @return
	 */
	public int delete(int id);

	/**
	 * 更新一条回复帖子信息
	 * 
	 * @param replyDetail
	 * @return
	 */
	public int update(ReplyDetail replyDetail);
}
