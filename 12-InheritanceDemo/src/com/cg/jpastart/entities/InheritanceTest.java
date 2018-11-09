package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InheritanceTest {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one employee
		Employee employee = new Employee();
		employee.setName("William");
		employee.setSalary(5000);
		em.persist(employee);
		
		//create one manager
		Manager manager = new Manager();
		manager.setName("Tara");
		manager.setSalary(8000);
		manager.setDepartmentName("Testing");
		em.persist(manager);
		
		//create one contract employee
		ContractEmployee contractEmployee = new ContractEmployee();
		contractEmployee.setName("Soumya");
		contractEmployee.setSalary(17000);
		contractEmployee.setDuration(8);
		contractEmployee.setExtendable(true);
		em.persist(contractEmployee);
		
		em.getTransaction().commit();
		
		System.out.println("Added one employee and manager to database.");
		
		
		
		
		em.close();
		factory.close();
	}
}
