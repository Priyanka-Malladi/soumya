package com.trainee.model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Main2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		//String jpql = "from Person";
		//String jpql = "select p from Person p ";
		//String jpql = "select p.name from Person p where p.salary between 7000 and 19000";
		String jpql = "select p from Person p where p.salary between :startRange and :endRange";
		
		
		Query query = em.createQuery(jpql);
		query.setParameter("startRange", 7000.0);
		query.setParameter("endRange", 19000.0);
		
		List<Person> persons = query.getResultList();
		for (Person person : persons) {
			System.out.println(person.getPersonId() + " \t " + person.getName() + " \t " + person.getAge()+ " \t " + person.getSalary() + " \t " + person.getGender());
		}
		em.close();
		factory.close();
	}

}
