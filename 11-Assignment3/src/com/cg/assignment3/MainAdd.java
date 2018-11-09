package com.cg.assignment3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class MainAdd {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();

		Course course = new Course();
		course.setC_name("HTML");
		FeeDetails feeDetails = new FeeDetails();
		feeDetails.setTotalFee(950.0);
		feeDetails.setNumberOfInstalment(1);
		course.setFeeDetails(feeDetails);
		
		em.getTransaction().begin();
		em.persist(course);
		em.getTransaction().commit();
		
		System.out.println("Added one Course with FeeDetails to database.");
		em.close();
		factory.close();
	}
}
