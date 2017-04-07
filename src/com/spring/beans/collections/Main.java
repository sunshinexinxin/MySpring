package com.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//1.����IOC����
		//ApplicationContext����IOC����
		//ClassPathXmlApplicationContext:��ApplicationContext�ӿڵ�ʵ���࣬����·���¼���
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.��IOC������ȡbean
		//����id��λ��IOC�е�bean
		
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
