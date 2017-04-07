package com.spring.beans;

public class HelloWorld {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public HelloWorld(){
		System.out.println("HelloWorld's Constructor...");
	}
	public void Hello(){
		System.out.println("hello "+name);
	}
}
