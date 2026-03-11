package com.jsp.controller;

import com.jsp.dto.Car;
import com.jsp.dto.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Fetchbyid {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		
		Car car= em.find(Car.class, 102);
		if (car!=null) {
			System.out.println("=====car details=======");
            System.out.println("Car ID: " + car.getCid());
            System.out.println("Car Name: " + car.getName());
            System.out.println("Car Price: " + car.getPrice());;
			
			Engine engine= car.getEngine();
			if (engine!=null) {
				System.out.println("=====engine details=======");
				System.out.println("Engine ID: " + engine.getEid());
                System.out.println("Fuel: " + engine.getFuel());
                System.out.println("CC: " + engine.getCc());
				
			}
					
		} else {
			System.out.println("========id not found============");

		}
		
	}

}
