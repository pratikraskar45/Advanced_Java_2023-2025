package com.jsp.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
//@Scope(value = "singleton")

public class Laptop {

}
