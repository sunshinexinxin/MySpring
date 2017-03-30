package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;






public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
/*		// TODO Auto-generated method stub
		//1.����HelloWorld�Ķ���
		HelloWorld helloWorld=new HelloWorld();
		//2.ΪHelloWorld��name���Խ��и�ֵ
		helloWorld.setName("Tom");*/
		
		//1.����IOC����
		//ApplicationContext����IOC����
		//ClassPathXmlApplicationContext:��ApplicationContext�ӿڵ�ʵ���࣬����·���¼���
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC������ȡbean
		//����id��λ��IOC�е�bean
		HelloWorld helloWorld=(HelloWorld) ctx.getBean("helloWorld");
		//3.����Hello����
		helloWorld.Hello();
		
		
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		
		car=(Car) ctx.getBean("car2");
		System.out.println(car);
	}

}
