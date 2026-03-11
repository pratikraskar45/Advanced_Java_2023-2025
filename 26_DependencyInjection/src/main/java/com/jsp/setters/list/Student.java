package com.jsp.setters.list;

import java.util.List;

public class Student {
	private String name;
	private List<String>subjests;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjests() {
		return subjests;
	}
	public void setSubjests(List<String> subjests) {
		this.subjests = subjests;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("===============");
		for (String subject : subjests) {
			System.out.println(subject);
			
		}

	}

}
