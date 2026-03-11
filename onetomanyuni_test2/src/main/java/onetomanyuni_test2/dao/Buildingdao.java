package onetomanyuni_test2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import onetomanyuni_test2.dto.Building;
import onetomanyuni_test2.dto.Floors;



public class Buildingdao {

	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	//1-insert the data
	public void savebuilding(Building building) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		List<Floors> list=building.getFloors();
		
		for(Floors floors:list) {
			entityManager.persist(floors);
		}
		entityManager.persist(building);
		entityTransaction.commit();
		
	}
	//2-Update the data
	public void updatebuilding(int id, Building building ) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		 Building building2=  entityManager.find(Building.class, id);
		if(building2!=null) {
			entityTransaction.begin();
			building.setId(building2.getId());
			building.setFloors(building2.getFloors());
			entityManager.merge(building);
			entityTransaction.commit();
		}else {
			System.out.println("id doesnt exist");
		}
		
	}
	//3-delete 
	public void deletebuilding(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Building building=  entityManager.find(Building.class, id);
		entityTransaction.begin();
		List<Floors>list=building.getFloors();
		
		for(Floors floors:list) {
			entityManager.remove(floors);
		}
		entityManager.remove(building);
		entityTransaction.commit();
		
	}
	//4-get details by id
	public void getbuildingbyid(int id) {
		EntityManager entityManager=getEntityManager();
		Building building=  entityManager.find(Building.class, id);
		
		System.out.println(building);
		
	}
	//4-get all details 
	
	public void getallbuilding() {
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("select b from  Building b");
		System.out.println(query.getResultList());
	}

}
