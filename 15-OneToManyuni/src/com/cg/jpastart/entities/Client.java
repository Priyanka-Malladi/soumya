package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import oracle.net.aso.d;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Department department = new Department();
		department.setId(20);
		department.setName("HR");

		//create two instances of employees
		Employee e1 = new Employee();
		e1.setId(5003);
		e1.setName("Riya Sharma");
		e1.setSalary(4800);
		
		Employee e2 = new Employee();
		e2.setId(5004);
		e2.setName("Manish Kumar");
		e2.setSalary(5400);
		
		department.addEmployee(e1);
		department.addEmployee(e2);
		//save department and its employees using entity manager
		em.persist(department);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
