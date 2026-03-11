package com.jsp.filedinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value(value = "Pratik")
	String name;
	@Value(value = "25")
	int age;
	@Value(value = "pratik@gmail.com")
	String email;
	public void display() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Email:"+email);
		
	}

}
