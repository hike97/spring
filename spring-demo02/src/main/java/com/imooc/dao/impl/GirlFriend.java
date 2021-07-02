package com.imooc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author hike97
 * @create 2021-07-02 23:16
 * @desc 循环依赖demo
 **/
public class GirlFriend {
	@Autowired
	private BoyFriend boyFriend;
}
