package com.xqy.cms.entity;

public class Setting {

	/**  **/
	private Integer id;
	/** 网站域名 **/
	private String site_domain;
	/** 网站名称 **/
	private String site_name;
	/** 文章列表数据条数 **/
	private Integer article_list_size;
	/** 轮播图最大条数 **/
	private Integer slide_size;
	/** 管理员帐号 **/
	private String admin_username;
	/** 管理员密码 **/
	private String admin_password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSite_domain() {
		return site_domain;
	}

	public void setSite_domain(String site_domain) {
		this.site_domain = site_domain;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public Integer getArticle_list_size() {
		return article_list_size;
	}

	public void setArticle_list_size(Integer article_list_size) {
		this.article_list_size = article_list_size;
	}

	public Integer getSlide_size() {
		return slide_size;
	}

	public void setSlide_size(Integer slide_size) {
		this.slide_size = slide_size;
	}

	public String getAdmin_username() {
		return admin_username;
	}

	public void setAdmin_username(String admin_username) {
		this.admin_username = admin_username;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

}
