package com.jsp;

public class Address {
//	@Value(value = "1104")
	String houseno;
//	@Value(value = "Mumbai")
	String city;
//	@Value(value = "410058")
	int pincode;
	
	public void displayaddress() {
		System.out.println("=====address=====");
		System.out.println("House No: "+houseno);
		System.out.println("City: "+city);
		System.out.println("Pincode: "+pincode);
		
	}
}
