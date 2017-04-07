package com.spring.beans.autowire;

public class Car {
	private String brand;
	private String crop;
	private double price;
	private int maxSpeed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCrop() {
		return crop;
	}
	
	public void setCrop(String crop) {
		this.crop = crop;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	public Car() {
		System.out.println("car's constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", crop=" + crop + ", price=" + price
				+ ", maxSpeed=" + maxSpeed + "]";
	}
	
}
