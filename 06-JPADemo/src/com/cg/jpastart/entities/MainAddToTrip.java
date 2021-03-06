package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainAddToTrip {
	
	public static void main(String[] args) {
		SeatInfo info = new SeatInfo(50,20,30);
		Trip trip = new Trip();
		trip.setFromCity("Chennai");
		trip.setToCity("Mumbai");
		trip.setInfo(info);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(trip);
		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}
