package com.imooc.service.impl;

import com.imooc.service.WelcomeService;
import org.springframework.stereotype.Service;

/**
 * @author hike97
 * @create 2021-06-04 21:40
 * @desc
 **/
@Service
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello (String name) {
		System.out.println ("欢迎您:" + name);
		return "success";
	}
}
