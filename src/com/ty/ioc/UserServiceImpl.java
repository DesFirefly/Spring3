package com.ty.ioc;

/**
 * 
 * @author DesFirefly
 * @date 2017年10月29日
 */
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		
		System.out.println("ty");
	}
	
	public void myinit(){
		System.out.println("init");
	}
	public void mydestroy(){
		System.out.println("destroy");
	}

}
