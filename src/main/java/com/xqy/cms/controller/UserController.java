package com.xqy.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}

	@RequestMapping("/register")
	public String register() {
		return "user/register";
	}
	
	@RequestMapping("/center")
	public String center() {
		return "user/center";
	}
	
	
}
