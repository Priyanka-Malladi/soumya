package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		Employee employee = null;
		employee = em.find(Employee.class, 4);
		System.out.println(employee);
		System.out.println(employee instanceof Employee);
		System.out.println(employee instanceof Manager);
		System.out.println(employee instanceof ContractEmployee);
		if (employee instanceof Employee) {
			Employee e = employee;
			System.out.println(e.getEmployeeId() + " \t " + e.getName() + " \t " + e.getSalary());
		}
		if (employee instanceof Manager) {
			Manager m = (Manager) employee;
			System.out.println(m.getDepartmentName() + " \t " + m.getEmployeeId() + " \t " + m.getName() + " \t " + m.getSalary());
		}
		if (employee instanceof ContractEmployee) {
			ContractEmployee ce = (ContractEmployee) employee;
			System.out.println(ce.getEmployeeId() + " \t " + ce.getName() + " \t " + ce.getSalary()  + " \t " + ce.getDuration());
		}
		em.close();
		factory.close();
	}
}
