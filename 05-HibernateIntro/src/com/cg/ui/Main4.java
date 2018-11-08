package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.business.Employee;

public class Main4 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee e = null;
		e = em.find(Employee.class, 103);
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
