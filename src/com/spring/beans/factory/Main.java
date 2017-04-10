package com.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-factory.xml");
		Car car=(Car) ctx.getBean("car1");
		System.out.println(car);
		
		car=(Car) ctx.getBean("car2");
		System.out.println(car);
	}

}
