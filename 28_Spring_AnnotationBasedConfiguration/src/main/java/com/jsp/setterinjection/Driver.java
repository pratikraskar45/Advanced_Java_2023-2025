package com.jsp.setterinjection;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(AppConfig.class);
		Student student= (Student) cac.getBean("student");
		student.display();
		
	}

}
