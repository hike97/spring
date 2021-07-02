package com.imooc;

import com.imooc.controller.WelcomeController;
import com.imooc.entity.User;
import com.imooc.service.WelcomeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.Arrays;

/**
 * @author hike97
 * @create 2021-06-04 21:39
 * @desc 测试源码
 **/
@Configuration
@ComponentScan("com.imooc")
public class Entrance {
	public static void main (String[] args) {
		System.out.println ("hello world");
		String xmlPath = "E:\\idea_workspace_2021\\spring-framework-5.2.15.RELEASE\\spring-demo02\\src\\main\\resources\\spring\\spring-config.xml";
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext (xmlPath);
		WelcomeService welcomeService = applicationContext.getBean ("welcomeService", WelcomeService.class);
		welcomeService.sayHello ("强大的spring框架");
		String[] names = applicationContext.getBeanDefinitionNames ();
		System.out.println (Arrays.toString (names));
	}

	public static void main1 (String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext (Entrance.class);
//		String[] names = applicationContext.getBeanDefinitionNames ();
//		for (String name : names) {
//			System.out.println (name);
//		}
//		WelcomeService welcomeService = applicationContext.getBean ("welcomeServiceImpl", WelcomeService.class);
//		welcomeService.sayHello ("强大的spring框架");
		//自定义增强器DEMO
		User user5 = applicationContext.getBean ("user5", User.class);
		System.out.println ("CustomizedBeanDefinitionRegistryPostProcessor 实例的对象: " + user5);
		//自定义BeanAwareDemo
		WelcomeController welcomeController = applicationContext.getBean ("welcomeController", WelcomeController.class);
		welcomeController.handleRequest ();
	}
}
