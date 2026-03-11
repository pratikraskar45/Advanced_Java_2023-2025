package com.jsp.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pratik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee e = new Employee();
		e.setEid(102);
		e.setName("Pratik");
		e.setSalary(500000);

		et.begin();
		em.persist(e);// insert record
		et.commit();

		System.out.println("Saved");
	}

}
