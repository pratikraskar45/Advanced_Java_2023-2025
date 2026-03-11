package spring_core.annotation;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Item{
	
	public void used() {
		System.out.println("Bike is used to travle ");
		
	}


}
