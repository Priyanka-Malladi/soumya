package com.cg.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainAdd {
	public static void main(String[] args) {
		Qualification qualification = new Qualification("MD",15);
		Doctor doctor = new Doctor();
		doctor.setId(103);
		doctor.setName("Rakesh");
		doctor.setFees(500.0);
		doctor.setQualification(qualification);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(doctor);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
