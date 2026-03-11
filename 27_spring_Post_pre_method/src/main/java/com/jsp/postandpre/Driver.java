package com.jsp.postandpre;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new ClassPathXmlApplicationContext("config.xml");
		 School school=(School) cac.getBean("school");
		 cac.close();
	}

}
