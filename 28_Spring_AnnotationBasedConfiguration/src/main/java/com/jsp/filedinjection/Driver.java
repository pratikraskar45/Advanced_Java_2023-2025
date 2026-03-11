package com.jsp.filedinjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		 ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(AppConfig.class);
		 Person person= (Person) cac.getBean("person");
		 person.display();
		 
	}

}
