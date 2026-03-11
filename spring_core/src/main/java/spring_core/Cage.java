package spring_core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //to tell IOC container to create object for particular class
public class Cage {
	
	@Autowired//to tell IOC container that we are building relationship between animal and cage 
	@Qualifier (value = "cow") //to tell ioc container that to give output of class which mentioned in qualifier  
	private Animal animal;
	 
	void animalsound() {
		animal.sound();
	}
	void animalcolor() {
		animal.color();
	}
	
	//primary and Qualifie give piroty give to Qualifier

}
