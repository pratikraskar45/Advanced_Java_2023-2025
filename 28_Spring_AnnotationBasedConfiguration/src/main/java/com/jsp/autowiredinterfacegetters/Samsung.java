package com.jsp.autowiredinterfacegetters;

import org.springframework.stereotype.Component;

@Component

public class Samsung implements Mobile {

	@Override
	public void ringing() {
		System.out.println("Samsung is ringing");
		
	}

}
