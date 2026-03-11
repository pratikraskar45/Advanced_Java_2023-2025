package com.jsp.controller;

import com.jsp.dto.Car;
import com.jsp.dto.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Car car=new Car();
		car.setCid(103);
		car.setName("Fortuner");
		car.setPrice(3500000);
	
		
		Engine engine=new Engine();
		engine.setEid(333);
		engine.setFuel("Disel");
		engine.setCc(3000);
		
		car.setEngine(engine);//to fk in car db
		
		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		System.out.println("==============data saved succesfully===========");
		
	}

}
