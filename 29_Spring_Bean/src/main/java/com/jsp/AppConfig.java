package com.jsp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.jsp")
public class AppConfig {
	@Bean
	public List<String> create() {
		 List<String>arrayList=new ArrayList<String>();
		 arrayList.add("Java");
		 arrayList.add("sql");
		 arrayList.add("oracle");
		 return arrayList;
	}
	@Bean(value = "myaddress")
	public Address createAddress() {
		Address address= new Address();
		address.houseno="101";
		address.city="Satara";
		address.pincode=785555;
		return address;
		
		
	}

}
