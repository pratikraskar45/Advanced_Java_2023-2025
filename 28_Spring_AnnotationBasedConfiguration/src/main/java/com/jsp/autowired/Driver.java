package com.jsp.autowired;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext app=new AnnotationConfigApplicationContext(Appconfig.class);
		Car car= (Car) app.getBean("car");
		car.display();
		
	}
	

}
