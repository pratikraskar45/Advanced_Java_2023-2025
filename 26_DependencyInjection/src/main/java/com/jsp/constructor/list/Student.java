package com.jsp.constructor.list;

import java.util.List;

public class Student {
	private String name;
	private  List<String>subjects;
	
	public Student(String name,List<String>subjects) {
		this.name=name;
		this.subjects=subjects;
		
	}
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("===================");
		for (String subject : subjects) {
			System.out.println(subject);
			
		}
		
	}

}
