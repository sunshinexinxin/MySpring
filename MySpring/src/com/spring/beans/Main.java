package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;






public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		//1.创建HelloWorld的对象
		HelloWorld helloWorld=new HelloWorld();
		//2.为HelloWorld的name属性进行赋值
		helloWorld.setName("Tom");*/
		
		//1.创建IOC容器
		//ApplicationContext代表IOC容器
		//ClassPathXmlApplicationContext:是ApplicationContext接口的实现类，从类路径下加载
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器获取bean
		//利用id定位到IOC中的bean
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
		//3.调用Hello方法
		helloWorld.Hello();
		
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		car=(Car) ctx.getBean("car2");
		System.out.println(car);
	}

}
