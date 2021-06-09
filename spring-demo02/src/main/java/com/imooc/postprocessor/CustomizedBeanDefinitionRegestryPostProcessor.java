package com.imooc.postprocessor;

import com.imooc.entity.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName CustomizedBeanDefinitionPostprocessor
 * @Description TODO
 * @Author hike97
 * @Date 2021/6/8 12:26
 * @Version 1.0
 **/
@Configuration
public class CustomizedBeanDefinitionRegestryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	@Override
	public void postProcessBeanFactory (ConfigurableListableBeanFactory beanFactory) throws BeansException {

	}

	@Override
	public void postProcessBeanDefinitionRegistry (BeanDefinitionRegistry registry) throws BeansException {
		Class<User> clazz = User.class;
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition (clazz);
		GenericBeanDefinition definition = (GenericBeanDefinition) builder.getRawBeanDefinition ();
		registry.registerBeanDefinition ("user5",definition);
	}
}
