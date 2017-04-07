package com.spring.beans.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.autowire.Address;
import com.spring.beans.autowire.Car;
import com.spring.beans.autowire.Person;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans-scope.xml");
		Car car=(Car) ctx.getBean("car");
		Car car2=(Car) ctx.getBean("car");
		System.out.println(car==car2);

	}

}
