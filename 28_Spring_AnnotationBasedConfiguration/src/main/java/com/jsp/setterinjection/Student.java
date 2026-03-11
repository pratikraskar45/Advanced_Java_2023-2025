package com.jsp.setterinjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	private int sid;
	private String name;
	public void display() {
		System.out.println("Sid:"+sid);
		System.out.println("Name:"+name);
		
	}
	public int getSid() {
		return sid;
	}
	@Value(value = "1")
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	@Value(value = "Pratik")
	public void setName(String name) {
		this.name = name;
	}
	
	

}
