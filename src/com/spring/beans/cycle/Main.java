package com.spring.beans.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beans.spel.Address;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans-cycle.xml");
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		//¹Ø±ÕIOCÈÝÆ÷
		ctx.close();
		
	}

}
