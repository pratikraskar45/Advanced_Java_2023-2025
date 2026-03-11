package spring_core;

import org.springframework.stereotype.Component;

@Component //to tell IOC container to create object for particular class

public class Cow implements Animal {
	
	public void sound() {
		System.out.println("cow sound is moooooooo");
		
	}
	public void color() {
		System.out.println("Cow color is black and white spots");
		
		
	}

}
