package spring_core.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Itemmain {
public static void main(String[] args) {
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Myconfiguration.class);
	Person person= applicationContext.getBean("person",Person.class);
	person.itemused();
	
	
}
}
