package com.jsp.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Employee emp= em.find(Employee.class, 102);
		if (emp!=null) {
			et.begin();
			em.remove(emp);
			et.commit();
			
		} else {
			System.out.println("Id not found");

		}
	}

}
