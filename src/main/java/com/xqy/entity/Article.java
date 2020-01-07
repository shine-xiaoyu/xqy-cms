package com.xqy.entity;

import java.util.Date;

public class Article {

	private Integer id;
	private String title;// '标题'
	private String content;// 文章内容
	private String picture;// 标题图片
	private Integer channel_id;// 所属栏目
	private Integer category_id;// 所属分类
	private Integer user_id;// 用户Id
	private Integer hits;// 点击次数
	private Integer hot;// 是否热门
	private Integer status;// '0：刚发布；2：草稿；1审核通过；-1 审核未通过;3:禁用'
	private Integer deleted;// '0:正常,1:删除',
	private Date created;// '发布时间'
	private Date updated;// '更新时间',
	private String commentCnt;// 评论数量
	private Integer tousuCnt;// 投诉次数

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Integer getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(Integer channel_id) {
		this.channel_id = channel_id;
	}

	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getHits() {
		return hits;
	}

	public void setHits(Integer hits) {
		this.hits = hits;
	}

	public Integer getHot() {
		return hot;
	}

	public void setHot(Integer hot) {
		this.hot = hot;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getCommentCnt() {
		return commentCnt;
	}

	public void setCommentCnt(String commentCnt) {
		this.commentCnt = commentCnt;
	}

	public Integer getTousuCnt() {
		return tousuCnt;
	}

	public void setTousuCnt(Integer tousuCnt) {
		this.tousuCnt = tousuCnt;
	}

}
