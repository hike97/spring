package com.imooc.entity.factory;

import com.imooc.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author hike97
 * @create 2021-06-07 0:37
 * @desc
 **/
public class UserFactoryBean implements FactoryBean<User> {
	@Override
	public User getObject () throws Exception {
		return new User ();
	}

	@Override
	public Class<?> getObjectType () {
		return null;
	}
}
