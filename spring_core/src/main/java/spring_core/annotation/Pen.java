package spring_core.annotation;

import org.springframework.stereotype.Component;

@Component
public class Pen implements Item {
	
	public void used() {
		System.out.println("pen is used to write");
		
	}

}
