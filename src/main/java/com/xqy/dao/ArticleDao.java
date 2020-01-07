package com.xqy.dao;

import java.util.List;

import com.xqy.entity.Article;
import com.xqy.entity.Category;
import com.xqy.entity.Channel;

public interface ArticleDao extends BaseDao<Article> {

	// 所属栏目回显
	List<Channel> selectChannel();

	// 所属分类回显
	List<Category> selectCategory();

}
