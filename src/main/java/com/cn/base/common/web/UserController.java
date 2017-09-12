package com.cn.base.common.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cn.base.common.dto.User;

@RestController
public class UserController {

	@RequestMapping("/user")
	@ResponseBody User getUser(){
		User user = new User();
		user.setAccountNo("456");
		user.setUserName("李四");
		user.setAge("15");
    	 return user;
	}
	@RequestMapping("/hello")
	@ResponseBody String hello(){
    	 return "hello lisi";
	}
}
