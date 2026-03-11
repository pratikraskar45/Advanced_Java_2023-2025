package com.jsp.autowiredinerface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Human {
	@Autowired
	Mobile mobile;
	
	public void use() {
		System.out.println("Person Using Mobile");
		mobile.ringing();
	}

}
