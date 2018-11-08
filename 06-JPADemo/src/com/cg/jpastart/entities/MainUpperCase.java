package com.cg.jpastart.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class MainUpperCase {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		String myQuery = "from Student";
		Query query = em.createQuery(myQuery);
		List<Student> stdList = null;
		stdList = query.getResultList();
		for (Student stud : stdList) {
			
			String n=stud.getName();
			n=n.toUpperCase();
			stud.setName(n);
			em.getTransaction().begin();
			em.merge(stud);
			em.getTransaction().commit();
		}
		em.close();
		factory.close();
	}

}
