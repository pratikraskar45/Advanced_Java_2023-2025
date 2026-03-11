package com.jsp.autowiredinerface;

import org.springframework.stereotype.Component;

@Component
//@Primary
public class Iphone implements Mobile {

	@Override
	public void ringing() {
		System.out.println("Iphone is ringing");
		
	}

}
