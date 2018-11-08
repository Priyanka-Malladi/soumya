package com.cg.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.business.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee employee = new Employee();
		employee.setEmpId(103);
		employee.setEmpName("Varun");
		employee.setBasicSalary(15000.0);
		employee.setEmpGender('M');
		employee.setEmpGrade('A');
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(employee);
		t.commit();
		em.close();
		emf.close();
		System.out.println("Object is stored in db");
	}

}
