package com.jsp.controller;

import java.util.Arrays;

import com.jsp.dto.Account;
import com.jsp.dto.Bank;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Insert {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Bank bank=new Bank();
		bank.setBid(102);
		bank.setBname("HDFC");
		bank.setAddress("Mumbai");
		
		Account a1=new Account();
		a1.setAccno(333);
		a1.setName("Jeevan");
		a1.setBalance(150000);
		
//		Account a2=new Account();
//		a2.setAccno(222);
//		a2.setName("Vishal");
//		a2.setBalance(30000);
		
		bank.setAccounts(Arrays.asList(a1)); 
		
		et.begin();
		em.persist(bank);
		em.persist(a1);
//		em.persist(a2);
		et.commit();
		System.out.println("====Insert the data====");
		
		
		
	}

}
