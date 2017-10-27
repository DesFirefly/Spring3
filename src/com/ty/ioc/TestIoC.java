package com.ty.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {

	@Test
	public void demo01(){
		UserService userService = new UserServiceImpl();
		userService.addUser();
	}
	
	@Test
	public void demo2(){
		//从spring容器获得
		//1获得容器
		String xmlPath = "com/ty/ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2获得内容 不需要自己new而是从spring容器中获得
		UserService userService = (UserService)applicationContext.getBean("userServiceId");
		userService.addUser();
	}
}
