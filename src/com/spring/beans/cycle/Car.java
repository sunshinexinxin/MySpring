package com.spring.beans.cycle;

public class Car {
	public Car(){
		System.out.println("Car's constructor!!");
	}
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		System.out.println("set brand...");
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}

	public void init(){
		System.out.println("init...");
	}
	public void destroy(){
		System.out.println("destroy...");
	}
}
