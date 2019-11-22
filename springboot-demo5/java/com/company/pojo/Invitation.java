package com.company.pojo;

import java.sql.Date;

/**
 * @author song
 * @category 帖子实体类
 */
public class Invitation {
	/**
	 * 帖子编号
	 */
	private int id;
	/**
	 * 帖子标题
	 */
	private String title;
	/**
	 * 帖子摘要
	 */
	private String summary;
	/**
	 * 作者
	 */
	private String author;
	/**
	 * 发布时间
	 */
	private Date createdate;

	public Invitation() {
		super();
	}

	public Invitation(int id, String title, String summary, String author, Date createdate) {
		super();
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.author = author;
		this.createdate = createdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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
