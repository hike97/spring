package com.mashibing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hike97
 * @create 2021-07-16 17:24
 * @desc spring Test类
 **/
public class Test {
	public static void main (String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext ("spring-${username}.xml");
//		ApplicationContext ac = new MyClassPathXmlApplicationContext ("spring-${username}.xml");
	}
}
