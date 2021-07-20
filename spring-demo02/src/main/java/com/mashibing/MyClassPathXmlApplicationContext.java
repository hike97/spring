package com.mashibing;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hike97
 * @create 2021-07-17 13:35
 * @desc
 **/
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext (String... configLocations) {
		super(configLocations);
	}

	@Override
	protected void initPropertySources () {
		System.out.println ("拓展 initPropertySource");
		getEnvironment ().setRequiredProperties ("username");
	}

	@Override
	protected void customizeBeanFactory (DefaultListableBeanFactory beanFactory) {
		beanFactory.setAllowBeanDefinitionOverriding (false);
		beanFactory.setAllowCircularReferences (false);
		super.customizeBeanFactory (beanFactory);
	}
}
