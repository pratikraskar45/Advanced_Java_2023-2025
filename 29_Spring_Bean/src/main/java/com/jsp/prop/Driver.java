package com.jsp.prop;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext cac=new AnnotationConfigApplicationContext(AppConfigProp.class);
		User user= (User) cac.getBean("user");
		user.display();
		
		
	}

}
