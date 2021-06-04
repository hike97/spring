package com.imooc;

import com.imooc.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author hike97
 * @create 2021-06-04 21:39
 * @desc 测试源码
 **/
public class Entrance {
	public static void main (String[] args) {
		System.out.println ("hello world");
		String xmlPath = "E:\\idea_workspace_2021\\spring-framework\\spring-demo\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext (xmlPath);
		WelcomeService welcomeService = applicationContext.getBean ("welcomeService", WelcomeService.class);
		welcomeService.sayHello ("强大的spring框架");

	}
}
