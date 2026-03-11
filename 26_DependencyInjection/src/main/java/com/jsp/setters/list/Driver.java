package com.jsp.setters.list;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("setterslist.xml");
		Student student= (Student) cac.getBean("student");
		student.display();
	}

}
