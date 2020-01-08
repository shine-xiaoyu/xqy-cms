package com.xqy.cms.entity;

//所属栏目表
public class Channel {

	/**  **/
	private Integer id;
	/** 名称 **/
	private String name;
	/** 描述 **/
	private String description;
	/** 图标 **/
	private String icon;
	/** 排序 **/
	private Integer sorted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getSorted() {
		return sorted;
	}

	public void setSorted(Integer sorted) {
		this.sorted = sorted;
	}

}
