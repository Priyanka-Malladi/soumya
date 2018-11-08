package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.business.Contact;

public class Main5 {
	public static void main(String[] args) {
		Contact contact1 = new Contact(104, "Priya", "8484950224");
		Contact contact2 = new Contact(105, "Shashi", "8484950223");
		Contact contact3 = new Contact(106, "Samiksha", "8484950225");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		/*em.persist(contact1);
		em.persist(contact2);
		em.persist(contact3);
		em.getTransaction().commit();*/
		contact1.setPhoneNo("8484950224");
		em.merge(contact1);
		em.close();
		emf.close();
		Contact contact4 = null;
		emf = Persistence.createEntityManagerFactory("JPA-PU");
		em = emf.createEntityManager();
		contact4 = em.find(Contact.class, 104);
		contact4.setPhoneNo("1236547890");
		em.merge(contact4);
		System.out.println(contact4.equals(contact1));
	}
	

}
