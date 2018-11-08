package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRetriveOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Address address = em.find(Address.class, 3);
		System.out.println(address.getStreet() + "\t" + address.getCity() + "\t" + address.getState() + "\t" + address.getZipCode());
		Student student = em.find(Student.class, 7);
		System.out.println(student.getName() + "\t" + student.getAddress().getStreet() + " \t " + student.getAddress().getCity()  + " \t " + student.getAddress().getState()  + "\t" + student.getAddress().getZipCode());
		em.close();
		factory.close();
	}

}
