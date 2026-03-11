package com.jsp.autowiredgetters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	private String name;
	private Mobile mobile;
	
	public void displayPerson() {
		System.out.println("Name:"+name);
		mobile.displayMobile();
		
	}
	public String getName() {
		return name;
	}
	@Value(value = "Pratik")
	public void setName(String name) {
		this.name = name;
	}
	public Mobile getMobile() {
		return mobile;
	}
	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

}
