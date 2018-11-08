package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.business.Employee;
//read 1 object
public class Main1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee e = null;
		e = em.find(Employee.class, 102);
		System.out.println(e);
		em.close();
		emf.close();
	}
}
