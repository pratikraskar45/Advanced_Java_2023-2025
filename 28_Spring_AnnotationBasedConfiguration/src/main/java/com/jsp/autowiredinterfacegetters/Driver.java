package com.jsp.autowiredinterfacegetters;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(InterfaceConfig.class);
		Human human= (Human) cac.getBean("human");
		human.use();
		
	}

}
