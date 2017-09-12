package com.cn.base.common.web;


import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

import com.cn.base.common.dto.User;
import com.cn.base.common.service.CommonService;

@RestController
@ComponentScan(basePackages={"com.cn.base.common"})
public class MainController {
	private final Logger log = (Logger) LoggerFactory.getLogger(MainController.class);
	@Autowired
	private CommonService commonService;
	
	//Logger
	
	@RequestMapping("/")
     User test(){
		commonService.saveUser();
		User user = new User();
		user.setAccountNo("123");
		user.setUserName("张三");
		user.setAge("12");
		log.info("logger test");
		log.error("error test");
    	 return user;
     }
	@RequestMapping("/unLoginUrlList")
    List getUrl(){
		log.info("logger getUrl");
		//return unloginResository.findAll();
		return commonService.getUnloginUrl();
     }
	@RequestMapping("/html")
    String returnHtml(Model model){
		log.info("logger returnHtml");
		model.addAttribute("htmlTest", "you are success");
		return "springBootIndex";
     }
	
}
