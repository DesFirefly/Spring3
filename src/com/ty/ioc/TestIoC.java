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
		//��spring�������
		//1�������
		String xmlPath = "com/ty/ioc/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		//2������� ����Ҫ�Լ�new���Ǵ�spring�����л��
		UserService userService = (UserService)applicationContext.getBean("userServiceId");
		userService.addUser();
	}
}
