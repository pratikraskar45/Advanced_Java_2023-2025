package com.jsp.controller;

import com.jsp.dto.Car;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car car =em.find(Car.class, 102);

		if (car!= null) {
			et.begin();
			em.remove(car);
			em.remove(car.getEngine());
			et.commit();
			
			
		} else {
			System.out.println("===id not found=====");
		}
		
				
	}

}
