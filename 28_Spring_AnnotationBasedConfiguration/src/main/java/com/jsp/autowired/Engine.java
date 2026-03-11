package com.jsp.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	@Value(value = "350")
	int cc;

}
