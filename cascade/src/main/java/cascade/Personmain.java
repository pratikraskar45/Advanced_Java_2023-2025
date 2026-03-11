package cascade;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Personmain {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		//1-save cascade
//		Person person=new Person();
//		person.setName("Pratik");
//		person.setPhone(4568785525l);
//		
//		Aadhar aadhar=new Aadhar();
//		aadhar.setName("Pratik");
//		aadhar.setAddress("Mumbai");
//		
//		person.setAadhar(aadhar);
//		
//		
//		
//		entityTransaction.begin();
//		entityManager.persist(person);
//		entityTransaction.commit();
		
		//2-update using cascade
//		Person person= entityManager.find(Person.class, 1);
//		person.setId(1);
//		person.setName("Vishal");
//		person.setPhone(9900005);
//		
//		Aadhar aadhar=new Aadhar();
//		aadhar.setId(1);
//		aadhar.setName("Vishal");
//		aadhar.setAddress("Satara");
//		
//		person.setAadhar(aadhar);
//		
//		entityTransaction.begin();
//		entityManager.merge(person);
//		entityTransaction.commit();
		
		//3-delete using cascade
//		Person person= entityManager.find(Person.class, 2);
//		
//		entityTransaction.begin();
//		entityManager.remove(person);
//		entityTransaction.commit();
		
		//4- for fetching  using cascade
	Person person=	entityManager.find(Person.class, 1);
	System.out.println(person);	
		
		
	}

}
