package com.imooc.controller;

import com.imooc.service.WelcomeService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;

import java.util.Arrays;

/**
 * @author hike97
 * @create 2021-06-06 23:37
 * @desc
 * 添加Aware接口实现 能够使用对应的拓展功能
 * 实现必要条件:当前bean对象受容器管理@Controller
 **/
@Controller
public class WelcomeController implements ApplicationContextAware, BeanNameAware {

	private String beanName;

	private ApplicationContext applicationContext;

	@Autowired
	private WelcomeService welcomeService;

	public void handleRequest(){
		welcomeService.sayHello ("来自controller的问候");
		System.out.println ("当前BeanName为: " + beanName);
		System.out.println ("输出上下文注册的BeanDefinitions################");
		Arrays.stream (applicationContext.getBeanDefinitionNames ()).forEach (System.out::println);
	}

	@Override
	public void setBeanName (String name) {
		this.beanName = name;
	}

	@Override
	public void setApplicationContext (ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
}
