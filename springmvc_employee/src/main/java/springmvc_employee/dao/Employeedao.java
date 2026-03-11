package springmvc_employee.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import springmvc_employee.dto.Employee;
@Repository
public class Employeedao {
	@Autowired
	private EntityManager entityManager;
	//1-Save
	public Employee saveEmployee(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
	//2-update
	public Employee updatEmployee(Employee employee) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		return employee;	
	}
	//3-delete
	public boolean deletEmployee(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee= entityManager.find(Employee.class, id);
		if (employee!=null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}else {
			return false;
		}
		
	}
	//4-get by id
	public Employee getEmployeebyid(int id) {
		return entityManager.find(Employee.class,id);	
		
	}
	//5-get all
	public List<Employee> getallEmployees() {
		Query query= entityManager.createQuery("select e from Employee e");
		return query.getResultList();
		
	}
}
