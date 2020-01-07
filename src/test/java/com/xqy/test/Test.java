package com.xqy.test;

import javax.annotation.Resource;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xqy.dao.UserDao;
import com.xqy.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class Test {
	
	@Resource
	private UserDao userDao;
	@org.junit.Test
	public void test() {
		User user = userDao.selectById(177);
		System.out.println(user);
	}
	
	
}
