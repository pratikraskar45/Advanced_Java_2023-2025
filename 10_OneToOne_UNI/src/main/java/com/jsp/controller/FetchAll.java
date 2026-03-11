package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Car;
import com.jsp.dto.Engine;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		
		Query query= em.createQuery("select c from  Car c");
		
		List<Car>cars=query.getResultList();
		System.out.println("============fetch all data========");
		for (Car car : cars) {
			if (car!=null) {
				System.out.println("Car:");
                System.out.println("Car ID: " + car.getCid());
                System.out.println("Car Name: " + car.getName());
                System.out.println("Car Price: " + car.getPrice());;
				//for engine
				Engine engine= car.getEngine();
				
				if (engine!=null) {
					System.out.println("Engine:");
                    System.out.println("Engine ID: " + engine.getEid());
                    System.out.println("Fuel: " + engine.getFuel());
                    System.out.println("CC: " + engine.getCc());
					System.out.println("=========================");
					
					
				}
			} else {
				System.out.println("No data found");
			}
			
			
			
			
		}
	}

}
