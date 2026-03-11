package com.jsp.autowiredconstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Person {
	private String name;
	private Mobile mobile;
	
	public Person(@Value(value = "Pratik") String name,@Autowired Mobile mobile) {
		this.name=name;
		this.mobile=mobile;
		
	}
	public void displayPerson() {
		System.out.println("Name:"+name);
		mobile.displayMobile();
		
	}
}
