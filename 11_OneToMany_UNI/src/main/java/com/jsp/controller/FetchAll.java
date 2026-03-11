package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Account;
import com.jsp.dto.Bank;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pratik");
		EntityManager em=emf.createEntityManager();
		Query query = em.createQuery("select b from Bank b");
		List<Bank>banks=query.getResultList();
		System.out.println("====Fetch All Data");
		for (Bank bank : banks) {
			if (bank!=null) {
				System.out.println("Bank:");
				System.out.println(bank);
//				System.out.println(bank.getBid());
//				System.out.println(bank.getBname());
//				System.out.println(bank.getAddress());
//				System.out.println(bank.getAccounts());
				 List<Account>accounts=bank.getAccounts();
				 for (Account account : accounts) {
					 if (account!=null) {
						 System.out.println("Account:");
						 System.out.println(account);
//						 System.out.println(account.getAccno());
//						 System.out.println(account.getName());
//						 System.out.println(account.getBalance());
						 System.out.println("=========");
						
					}
					
				}
					
				}
			}
			
		}
		
	}


