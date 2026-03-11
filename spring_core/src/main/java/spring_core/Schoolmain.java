package spring_core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Schoolmain {
	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("school.xml");
		Gurukul gurukul=(Gurukul) beanFactory.getBean("gurukul");
		
		gurukul.name();
		System.out.println(gurukul.getFees());
		
		DPS dps=(DPS) beanFactory.getBean("dps");
		
		dps.name();
		System.out.println(dps.getFees());
	}

}
