package springmvc_employee.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springmvc_employee")
public class Employeeconfig {
	@Bean //to tell IOC container create a object for third party classes
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
		
	}


}
