package com.jsp.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	@Value(value = "${uname}")
	String name;
	@Value(value = "${upassword}")
	String password;
	
	

	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Password: "+password);
		
		
	}

}
