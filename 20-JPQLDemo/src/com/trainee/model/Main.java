package com.trainee.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Person p1 = new Person("Ashwyn", 22, 15000, 'M');
		Person p2 = new Person("Priya",23 , 12500, 'F');
		Person p3 = new Person("Usha", 25, 25000, 'F');
		Person p4 = new Person("Ajay", 23, 18000, 'M');
		Person p5 = new Person("Rahul", 22, 17000, 'M');
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.persist(p5);
		em.getTransaction().commit();
		em.close();
		factory.close();
		
	}

}
