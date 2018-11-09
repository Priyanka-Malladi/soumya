package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainReadOneEmployee {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Employee e = em.find(Employee.class, 1001);
		System.out.println(e.getName() + " \t " + e.getSalary() + " \t " + e.getDepartment().getName());
		em.close();
		factory.close();

	}

}
