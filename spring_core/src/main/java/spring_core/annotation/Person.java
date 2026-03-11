package spring_core.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired 
	@Qualifier (value = "bike")
	private Item item;
	
	void itemused() {
		item.used();
	}

}
