package com.imooc.entity.factory;

import com.imooc.entity.User;

/**
 * @author hike97
 * @create 2021-06-07 0:01
 * @desc
 **/
public class UserFactory {

	public  User getUser(){
		return new User ();
	}
}
