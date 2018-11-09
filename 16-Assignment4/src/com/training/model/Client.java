package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		//create a new Loan
				Loan loan = new Loan();
				loan.setCustomerName("Ramesh");
				loan.setLoanAmount(25000.0);

				//create two instances of repyment
				Repayment repayment1 = new Repayment();
				repayment1.setRepayAmount(10000.0);
				repayment1.setInstalmentNo(1);
				
				Repayment repayment2 = new Repayment();
				repayment2.setRepayAmount(5000.0);
				repayment2.setInstalmentNo(2);
				
				loan.addRepayment(repayment1);
				loan.addRepayment(repayment2);
				
				em.getTransaction().begin();
				em.persist(repayment1);
				em.persist(repayment2);
				em.persist(loan);
				em.getTransaction().commit();
				em.close();
				factory.close();
	}

}
