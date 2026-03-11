package com.jsp.controller;

import com.jsp.dto.Car;
import com.jsp.dto.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		Car car= em.find(Car.class, 105);//update the car
		if (car!=null) {
			car.setName("Thar");
			car.setPrice(3000000);
			
			//update the engine
			Engine engine= car.getEngine();
			if (engine!=null) {
				engine.setFuel("Disel");
				engine.setCc(3500);
				
			}
			et.begin();
			em.merge(car);
			em.merge(engine);
			et.commit();
			System.out.println("=====Car and engine Updated=====");
			
		} else {
			System.out.println("======Id not found==========");

		}
		
	}

}
