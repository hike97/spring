package com.imooc.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CustomizedBeanPostProcessor
 * @Description TODO
 * @Author hike97
 * @Date 2021/6/8 18:58
 * @Version 1.0
 **/
@Configuration
public class CustomizedBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessBeforeInitialization (Object bean, String beanName) throws BeansException {
		System.out.println (beanName + "调用了postProcessBeforeInitialization");
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization (Object bean, String beanName) throws BeansException {
		System.out.println (beanName + "调用了postProcessAfterInitialization");
		return bean;
	}
}
