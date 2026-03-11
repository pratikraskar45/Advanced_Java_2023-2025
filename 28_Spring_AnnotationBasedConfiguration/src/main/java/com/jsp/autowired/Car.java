package com.jsp.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Value(value = "Bmw")
	String brand;
	@Value(value = "120000")
	double price;
	@Autowired
	Engine engine;
	
	public void display() {
		System.out.println("Car Name:"+brand);
		System.out.println("Car Price:"+price);
		System.out.println("Car Engine:"+engine.cc);
		
	}

}
