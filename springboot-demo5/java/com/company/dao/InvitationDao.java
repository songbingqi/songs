package com.company.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.company.pojo.Invitation;

/**
 * @author song
 * @category 业务访问接口
 */
@Repository("InvitationDao.xml")
public interface InvitationDao {
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
	public int insert(Invitation invitation);

	/**
	 * 删除帖子信息（数组）
	 * 
	 * @param ids
	 * @return
	 */
	public int delete(int[] ids);

	/**
	 * 更新帖子信息
	 * 
	 * @param invitation
	 * @return
	 */
	public int update(Invitation invitation);

}
