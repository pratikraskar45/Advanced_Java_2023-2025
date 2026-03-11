package com.jsp.constructorinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	String brand;
	int cc;
	public Bike(@Value(value = "Bajaj") String brand,@Value(value = "350") int cc) {
		this.brand=brand;
		this.cc=cc;
		
	}
	public void display() {
		System.out.println("Bike Name:"+brand);
		System.out.println("Bike CC:"+cc);
		
	}

}
