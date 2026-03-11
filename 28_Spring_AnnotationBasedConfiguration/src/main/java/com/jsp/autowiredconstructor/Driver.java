package com.jsp.autowiredconstructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
	
	ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(ContructorConfig.class);
	Person person= (Person) cac.getBean("person");
	person.displayPerson();
	
	
	}

}
