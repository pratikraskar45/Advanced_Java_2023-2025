package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Account;
import com.jsp.dto.Bank;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class fetchbyID {
	public static void main(String[] args) {
		
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
	EntityManager em=emf.createEntityManager();
	Bank bank = em.find(Bank.class, 101);
	if (bank!=null) {
		System.out.println(bank);
		List<Account>accounts=bank.getAccounts();
		for (Account account : accounts) {
			System.out.println(account.getAccno());
			System.out.println(account.getName());
			System.out.println(account.getBalance());
			System.out.println("=========");
			
		}
		
	} else {
		System.out.println("Id not found");
	}
	}
}
