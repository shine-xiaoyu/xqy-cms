package com.xqy.entity;

import java.util.Date;

//连接表（外部广告）
public class Link {
	/**  **/
	private Integer id;
	/** 商家 **/
	private String text;
	/** 路径 **/
	private String url;
	/** 创建时间 **/
	private Date created;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
