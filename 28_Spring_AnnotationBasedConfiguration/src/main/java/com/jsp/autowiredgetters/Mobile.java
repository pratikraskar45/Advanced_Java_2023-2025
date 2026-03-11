package com.jsp.autowiredgetters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String brand;
	private double price;
	
	public void displayMobile() {
		System.out.println("Mobile Brand:"+brand);
		System.out.println("Mobile Price:"+price);
		
		
	}
	public String getBrand() {
		return brand;
	}
	@Value(value = "Samsung")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	@Value(value = "15000")
	public void setPrice(double price) {
		this.price = price;
	}
	

}
