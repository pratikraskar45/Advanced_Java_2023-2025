package com.jsp.autowiredinterfacegetters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Human {
	
	Mobile mobile;
	//getters and setters
//	@Autowired
//	@Qualifier(value = "iphone")
//	@Qualifier(value = "samsung")
//	public void setMobile(Mobile mobile) {
//		this.mobile = mobile;
//	}
	//========================================================
	//for constructor
	@Autowired
	
	public Human( @Qualifier(value = "iphone")Mobile mobile) {
		this.mobile=mobile;
		
	}
	
	
	
	
	public void use() {
		System.out.println("Person Using Mobile");
		mobile.ringing();
	}

}
