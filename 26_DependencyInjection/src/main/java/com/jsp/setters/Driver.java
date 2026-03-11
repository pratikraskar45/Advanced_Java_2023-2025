package com.jsp.setters;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("setters.xml");
		
		Person person= (Person) cac.getBean("person");
		System.out.println(person.getName());
		System.out.println(person.getPhone());
	}

}
