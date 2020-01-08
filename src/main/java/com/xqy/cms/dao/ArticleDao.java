package com.xqy.cms.dao;

import java.util.List;

import com.xqy.cms.entity.Article;
import com.xqy.cms.entity.Category;
import com.xqy.cms.entity.Channel;

public interface ArticleDao extends BaseDao<Article> {

	// 所属栏目回显
	List<Channel> selectChannel();

	// 所属分类回显
	List<Category> selectCategory();

}
