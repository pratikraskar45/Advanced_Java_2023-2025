package com.jsp.corecontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("coreconfig.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Person person= (Person) beanFactory.getBean("personbean");
		person.play();
		System.out.println("===============");
		
		Studnet studnet= (Studnet) beanFactory.getBean("studentbean");
		System.out.println(studnet.sid());
		System.out.println(studnet.sname());
		

		
	}

}
