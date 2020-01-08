package com.xqy.test;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xqy.cms.dao.ArticleDao;
import com.xqy.cms.pojo.Article;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class Test {
	
	@Resource
	private ArticleDao articleDao;
	@org.junit.Test
	public void test() {
		Article user = articleDao.selectById(1);
		System.out.println(user);
	}
	
	
}
