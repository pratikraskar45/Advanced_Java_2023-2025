package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student) cac.getBean("mystudent");
		student.study();
		System.out.println("=============");
		Mobile mobile= (Mobile) cac.getBean("mymobile");
		mobile.ring();
		System.out.println("===============");
		
		ConfigurableApplicationContext capp=new ClassPathXmlApplicationContext("config1.xml");
		Student student1=(Student) capp.getBean("mystudent");
		student1.study();
		System.out.println("=============");
		Mobile mobile1= (Mobile) capp.getBean("mymobile");
		mobile1.ring();
		System.out.println("===============");
		
		
		
		
		
		
	}

}
