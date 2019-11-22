package com.company.service;

import java.util.List;

import com.company.pojo.Invitation;

public interface InvitationService {
	/**
	 * 查询所有帖子信息
	 * 
	 * @return
	 */
	public List<Invitation> find();

	/**
	 * 根据帖子id查询帖子
	 * 
	 * @param id
	 * @return
	 */
	public Invitation findById(int id);

	/**
	 * 增加一条帖子信息
	 * 
	 * @param invitation
	 * @return
	 */
	public boolean insert(Invitation invitation);

	/**
	 * 删除帖子信息（数组）
	 * 
	 * @param ids
	 * @return
	 */
	public boolean delete(int[] ids);

	/**
	 * 更新帖子信息
	 * 
	 * @param invitation
	 * @return
	 */
	public boolean update(Invitation invitation);

}
