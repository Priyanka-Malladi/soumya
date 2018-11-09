package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainReadOneDepartment{

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Department d = em.find(Department.class,10);
		System.out.println(d.getName() + " \t " + d.getEmployees().size());
		for (Employee e:d.getEmployees()){
			System.out.println(e.getName() + " \t " + e.getSalary());
		}
		em.close();
		factory.close();
	}

}
