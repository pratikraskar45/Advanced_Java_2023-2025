package com.jsp.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("constructor.xml");
		Person person= (Person) cac.getBean("person");
		person.display();
	}

}
