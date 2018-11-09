package com.trainee.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main3 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Query query = em.createNamedQuery("MaleFilterQuery");
		Query query1 = em.createNamedQuery("FemaleFilterQuery");
		List<Person> person = query.getResultList();
		for (Person p : person) {
			System.out.println("Male Only List");
			System.out.println(p.getPersonId() + " \t " + p.getName() + " \t " + p.getAge()+ " \t " + p.getSalary() + " \t " + p.getGender());
		}
		List<Person> person1 = query1.getResultList();
		for (Person p : person1) {
			System.out.println("Female Only List");
			System.out.println(p.getPersonId() + " \t " + p.getName() + " \t " + p.getAge()+ " \t " + p.getSalary() + " \t " + p.getGender());
		}
		em.close();
		factory.close();
	}

}
