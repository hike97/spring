package com.imooc.controller;

import com.imooc.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author hike97
 * @create 2021-06-06 23:37
 * @desc
 **/
@Controller
public class WelcomeController {

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest(){
		welcomeService.sayHello ("来自controller的问候");
	}
}
