package com.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.annotation.controller.UserController;
import com.spring.beans.annotation.repository.UserRepository;
import com.spring.beans.annotation.repository.UserRepositoryImpl;
import com.spring.beans.annotation.service.UserService;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-annotation.xml");
		TestObject testObject =(TestObject) ctx.getBean("testObject");
		System.out.println(testObject);
		
		UserController userController=(UserController) ctx.getBean("userController");
		System.out.println(userController);
		
		UserService userService=(UserService) ctx.getBean("userService");
		System.out.println(userService);
		
		UserRepository userRepository=(UserRepository) ctx.getBean("userRepository");
		System.out.println(userRepository);
	}

}
