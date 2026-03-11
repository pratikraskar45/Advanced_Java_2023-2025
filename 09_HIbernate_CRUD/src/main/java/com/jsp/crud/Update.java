package com.jsp.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emp= em.find(Employee.class, 101);
		if (emp !=null) {
			emp.setName("Vishal Jadhav");
			emp.setSalary(30000);
			
			et.begin();
			Employee update= em.merge(emp);
			et.commit();
			
			System.out.println("Updated Employee");
			System.out.println(update.getEid());
			System.out.println(update.getName());
			System.out.println(update.getSalary());
			
		} else {
			System.out.println("id not found ");

		}
		
	}

}
