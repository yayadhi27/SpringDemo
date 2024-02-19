package com.jaya.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jaya.demo.User;

public class Testuser {
	
	public static void main(String args[]) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		User u =(User)context.getBean("u2");
		
		u.invokeAdd(10,20);
		
	}

}
