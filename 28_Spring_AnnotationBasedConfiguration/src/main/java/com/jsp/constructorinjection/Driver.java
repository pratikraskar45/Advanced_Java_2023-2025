package com.jsp.constructorinjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(com.jsp.constructorinjection.AppConfig.class);
		 Bike bike= (Bike) cac.getBean("bike");
		 bike.display();
	}

}
