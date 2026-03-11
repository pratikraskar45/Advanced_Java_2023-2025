package spring_core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //to tell IOC container to create object for particular class
@Primary // to tell IOC  container that we are making lion as a default class  
public class Lion implements Animal {
	public void sound() {
		System.out.println("lion sounds is roar");
		
	}
	public void color() {
		System.out.println("Lion color is yellow and black lines");
	}

}
