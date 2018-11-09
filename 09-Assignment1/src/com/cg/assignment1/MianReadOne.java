package com.cg.assignment1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MianReadOne {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Doctor doctor = null;
		doctor = em.find(Doctor.class, 102);
		System.out.println(doctor);
		System.out.println(doctor.getQualification());
		em.close();
		factory.close();
	}
}
