package com.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//1.创建IOC容器
		//ApplicationContext代表IOC容器
		//ClassPathXmlApplicationContext:是ApplicationContext接口的实现类，从类路径下加载
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器获取bean
		//利用id定位到IOC中的bean
		
		Person person=(Person) ctx.getBean("person3");
		System.out.println(person);
		
		NewPerson newPerson=(NewPerson) ctx.getBean("newPerson");
		System.out.println(newPerson);

		DataSource dataSource=(DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource);
		
		person=(Person) ctx.getBean("person4");
		System.out.println(person);
		
		person=(Person) ctx.getBean("person5");
		System.out.println(person);
		
		
	}

}
