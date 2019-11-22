package com.company.pojo;

import java.sql.Date;

/**
 * @author song
 * @category 回复帖实体类
 */
public class ReplyDetail {
	/**
	 * 回复帖子编号
	 */
	private int id;
	/**
	 * 帖子编号
	 */
	private int invid;
	/**
	 * 回复帖子内容
	 */
	private String content;
	/**
	 * 回复帖子作者
	 */
	private String author;
	/**
	 * 回复帖子时间
	 */
	private Date createdate;

	public ReplyDetail() {
		super();
	}

	public ReplyDetail(int id, int invid, String content, String author, Date createdate) {
		super();
		this.id = id;
		this.invid = invid;
		this.content = content;
		this.author = author;
		this.createdate = createdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getInvid() {
		return invid;
	}

	public void setInvid(int invid) {
		this.invid = invid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}
