package com.jsp.autowiredgetters;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(Appconfig1.class);
		Person person=(Person)cac.getBean("person");
		person.displayPerson();
		
	}

}
