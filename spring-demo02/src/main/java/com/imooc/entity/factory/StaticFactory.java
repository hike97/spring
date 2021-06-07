package com.imooc.entity.factory;

import com.imooc.entity.User;

/**
 * @author hike97
 * @create 2021-06-07 0:00
 * @desc
 **/
public class StaticFactory {

	public static User getUser(){
		return new User ();
	}
}
