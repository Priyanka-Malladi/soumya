package com.cg.assignment2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainReadOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		System.out.println("-----------------------------");
		System.out.println("From Course");
		System.out.println("===========");
		Course course = em.find(Course.class, 2);
		System.out.println(course.getC_id()  + " \t " + course.getC_name() + " \t " + course.getFeeDetails().getTotalFee() + " \t " + course.getFeeDetails().getNumberOfInstalment());
		System.out.println("From FeeDetails");
		System.out.println("===========");
		FeeDetails feeDetails = em.find(FeeDetails.class, 102);
		System.out.println(feeDetails.getF_id() + " \t " + feeDetails.getTotalFee() + " \t " + feeDetails.getNumberOfInstalment());
		em.close();
		factory.close();
	}

}
