package com.xqy.entity;

//投票表
public class Vote {

	/**  **/
	private Integer id;
	/** 文章Id **/
	private Integer article_id;
	/** 用户Id **/
	private Integer user_id;
	/** 选项 **/
	private String option;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getArticle_id() {
		return article_id;
	}

	public void setArticle_id(Integer article_id) {
		this.article_id = article_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

}
