package com.xqy.cms.entity;

//评论表
public class Comment {

	/**  **/
	private Integer id;
	/** 文章Id **/
	private Integer articleId;
	/** 用户Id **/
	private Integer userId;
	/** 评论内容 **/
	private String content;
	/** 评论时间 **/
	private String created;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArticleId() {
		return articleId;
	}

	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

}
