package com.jsp.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetchbyid {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		
		Employee emp= em.find(Employee.class, 102);
		if (emp!=null) {
			System.out.println(emp.getEid());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			
		} else {
			System.out.println("Id not found");

		}
	}

}
