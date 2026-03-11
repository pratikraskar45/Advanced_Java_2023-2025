package com.jsp.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		//by JQL query
		Query query= em.createQuery("select e from Employee e");
		//by naming based query
//		Query query = em.createQuery("select e from Employee e where e.salary=:sal");//naming based parameter
//		query.setParameter("sal", 30000);
		
//		by indexing based query
//		Query query = em.createQuery("select e from Employee e where e.salary>=?1");// index based parameter
//		query.setParameter(1, 45000);
		
		List<Employee>employees=query.getResultList();
		
		System.out.println("====================");
		for (Employee employee : employees) {
			System.out.println(employee.getEid());
			System.out.println(employee.getName());
			System.out.println(employee.getSalary());
			System.out.println("========================");
			
		}
	}

}
