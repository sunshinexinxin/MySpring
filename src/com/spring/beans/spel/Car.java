package com.spring.beans.spel;

public class Car {
	private String brand;
	private double price;
	//ÂÖÌ¥µÄÖÜ³¤
	private String typePerimeter;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getTypePerimeter() {
		return typePerimeter;
	}
	public void setTypePerimeter(String typePerimeter) {
		this.typePerimeter = typePerimeter;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	public Car() {
		System.out.println("car's constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", typePerimeter="
				+ typePerimeter + "]";
	}
	
	
}
