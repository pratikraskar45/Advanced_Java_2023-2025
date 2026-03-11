package onetooneuni_test1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetooneuni_test1.dto.Aadhar;
import onetooneuni_test1.dto.Person;



public class Persondao {
	//for database build
		public EntityManager getEntityManager() {
			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
			
			//to perform CRUD operation
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			return entityManager;
			
		
		}
		
		//1-create or insert the data
		public void saveperson(Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Aadhar aadhar=person.getAadhar();
		
		
		entityTransaction.begin();
		entityManager.persist(aadhar);
		entityManager.persist(person);
		entityTransaction.commit();
		
		}
		//2-update person
		  public void updateperson(int id,Person person) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Person Person1=entityManager.find(Person.class, id);
			
			if (Person1!=null) {
				person.setId(id);
				person.setAadhar(Person1.getAadhar());
			}
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
			
		}
		//3-Delete passport and person
		public void deleteperson(int id) {
			EntityManager entityManager=getEntityManager();
			EntityTransaction entityTransaction=entityManager.getTransaction();
			Person person=  entityManager.find(Person.class, id);
			Aadhar aadhar= person.getAadhar();
			
			entityTransaction.begin();
			entityManager.remove(aadhar);
			entityManager.remove(person);
			entityTransaction.commit();
			
		}
		//4-get id or find
		public void getpersonbyid(int id ) {
			EntityManager entityManager=getEntityManager();
			Person person= entityManager.find(Person.class, id);
			System.out.println(person);
			
			
		}
		 //5-get all details by  to JPQl-java persistence query language 
			public void getallperson() {
				
				EntityManager entityManager=getEntityManager();    
				Query query=entityManager.createQuery("select p from Person p");
				System.out.println(query.getResultList());
				
		
				
			}

}
