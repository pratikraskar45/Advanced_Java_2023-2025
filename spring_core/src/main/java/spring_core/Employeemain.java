package spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employeemain {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=(Employee) applicationContext.getBean("employee");
		System.out.println(employee);
		
		
	}

}
