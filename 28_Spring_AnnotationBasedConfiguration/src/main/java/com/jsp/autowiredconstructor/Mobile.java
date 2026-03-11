package com.jsp.autowiredconstructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	private String brand;
	private double price;
	public Mobile(@Value(value = "Iphone") String brand,@Value(value = "450000") double price) {
		this.brand=brand;
		this.price=price;
		
	}
	public void displayMobile() {
		System.out.println("Phone name:"+brand);
		System.out.println("Phone price:"+price);
		
	}

}
