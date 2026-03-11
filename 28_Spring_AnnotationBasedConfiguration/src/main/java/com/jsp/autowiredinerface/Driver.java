package com.jsp.autowiredinerface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(InterfaceConfigfield.class);
		Human human= (Human) cac.getBean("human");
		human.use();
		
	}

}
