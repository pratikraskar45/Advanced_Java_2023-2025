package com.jsp.scope;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(Appconfigscope.class);
		Laptop lp1= (Laptop) cac.getBean("laptop");
		System.out.println(lp1);
		Laptop lp2= (Laptop) cac.getBean("laptop");
		System.out.println(lp2);
		
	}

}
