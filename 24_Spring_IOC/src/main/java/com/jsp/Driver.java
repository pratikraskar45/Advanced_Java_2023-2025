package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	//CORE CONTAINER
//	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("config.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
//		Person person=(Person) factory.getBean("myperson");
//		person.play();
//	}
	//j2EE CONTAINER
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
		Person person=(Person) applicationContext.getBean("myperson");
		person.play();
		person.add();
		
		Employee employee=(Employee)applicationContext.getBean("myemp");
		System.out.println(employee.eid());
		System.out.println(employee.ename());
		
		
		
	
	}
	
	

}
