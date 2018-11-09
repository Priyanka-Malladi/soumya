package com.cg.assignment5;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		// Customers
		
				Customer customer1 = new Customer();
				customer1.setId(101);
				customer1.setName("ram");
				customer1.setDob(new Date(1990,05,21));
				
				Customer customer2 = new Customer();
				customer2.setId(102);
				customer2.setName("shyam");
				customer2.setDob(new Date(1890,02,30));
			
				Customer customer3 = new Customer();
				customer3.setId(103);
				customer3.setName("raj");
				customer3.setDob(new Date());
				
				Customer customer4 = new Customer();
				customer4.setId(104);
				customer4.setName("rahul");
				customer4.setDob(new Date());
				
				Customer customer5 = new Customer();
				customer5.setId(105);
				customer5.setName("Rohan");
				customer5.setDob(new Date());
				
				Customer customer6 = new Customer();
				customer6.setId(106);
				customer6.setName("Mohan");
				customer6.setDob(new Date());
				
				
				Customer customer7 = new Customer();
				customer7.setId(107);
				customer7.setName("Sohan");
				customer7.setDob(new Date());
				
				Customer customer8 = new Customer();
				customer8.setId(108);
				customer8.setName("Pooja");
				customer8.setDob(new Date());
				
				Customer customer9 = new Customer();
				customer9.setId(109);
				customer9.setName("Shakti");
				customer9.setDob(new Date());
				
				Customer customer10 = new Customer();
				customer10.setId(110);
				customer10.setName("Anand");
				customer10.setDob(new Date());
				
		//banks
		Bank bank1 = new Bank();
		bank1.setId(1);
		bank1.setName("State Bank of India");
		bank1.setBankOfficeLocation("Nagpur");
		
		bank1.addCustomer(customer1);
		bank1.addCustomer(customer3);
		
		customer1.addBank(bank1);
		customer3.addBank(bank1);
		//-------------------------------
		Bank bank2 = new Bank();
		bank2.setId(2);
		bank2.setName("HDFC Bank");
		bank2.setBankOfficeLocation("Pune");
		
		bank2.addCustomer(customer5);
		bank2.addCustomer(customer7);
		
		customer5.addBank(bank2);
		customer7.addBank(bank2);
		//-------------------------------
		
		Bank bank3 = new Bank();
		bank3.setId(3);
		bank3.setName("Kotak Mahindra Bank");
		bank3.setBankOfficeLocation("Chennai");
		
		bank3.addCustomer(customer9);
		bank3.addCustomer(customer2);
		
		customer9.addBank(bank3);
		customer2.addBank(bank3);
		//-------------------------------
		
		Bank bank4 = new Bank();
		bank4.setId(4);
		bank4.setName("UCO Bank");
		bank4.setBankOfficeLocation("Bilaspur");
		
		bank4.addCustomer(customer4);
		bank4.addCustomer(customer6);
		
		customer4.addBank(bank4);
		customer6.addBank(bank4);
		//-------------------------------
		
		Bank bank5 = new Bank();
		bank5.setId(5);
		bank5.setName("ICICI Bank");
		bank5.setBankOfficeLocation("Hyderabad");
		
		bank5.addCustomer(customer8);
		bank5.addCustomer(customer10);
		
		customer8.addBank(bank5);
		customer10.addBank(bank5);
		//-------------------------------
		
		em.getTransaction().begin();
		em.persist(bank1);
		em.persist(bank2);
		em.persist(bank3);
		em.persist(bank4);
		em.persist(bank5);
		System.out.println("Added bank along with customers in database.");
		em.getTransaction().commit();
		
		
		em.close();
		factory.close();
		 

	}
}
