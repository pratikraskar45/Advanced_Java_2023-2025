package spring_core.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//not search XML file
@Configuration //to tell IOC container that not to search for XML file because Configuration will act as XML file
@ComponentScan(basePackages = "spring_core.annotation")
public class Myconfiguration {
	

}
