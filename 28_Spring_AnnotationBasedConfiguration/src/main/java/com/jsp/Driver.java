package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext  cac=new AnnotationConfigApplicationContext(Appconfig.class);
		Person person=(Person) cac.getBean("person");
		person.play();
		PersonApp personApp= (PersonApp) cac.getBean("personApp");
		personApp.Speak();
		MI mi=(MI) cac.getBean("MI");
		mi.Ipl();
		
		
		
		
		
	}

}
