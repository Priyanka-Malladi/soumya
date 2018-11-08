package com.cg.ui;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.cg.business.Customer;
import com.cg.db.CustomerDAO;
import com.cg.db.CustomerDAOImpl;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("-----Customer Application-----");
		System.out.println("______________________________");
		System.out.println("1. Add New Coustomer");
		System.out.println("2. Update Coustomer");
		System.out.println("3. Delete Coustomer");
		System.out.println("4. Display All Coustomer");
		System.out.println("5. Exit");
		Scanner scanner = new Scanner(System.in);
		int option;
		System.out.println("Enter Choice");
		option = scanner.nextInt();
		switch (option) {
		case 1:
			add();
			break;
		case 2:
			update();
			break;
		case 3:
			remove();
			break;
		case 4:
			display();
			break;
		case 5:
			System.out.println("Thank you !!!");
			break;
		}
	}

	public static void add() throws ClassNotFoundException, SQLException {
		System.out.println("Enter values to add");
		int inp_id = 0;
		String inp_name = null;
		String inp_city = null;
		double inp_amt = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id");
		inp_id = scanner.nextInt();
		System.out.println("Enter name");
		inp_name = scanner.next();
		System.out.println("Enter city");
		inp_city = scanner.next();
		System.out.println("Enter amount");
		inp_amt = scanner.nextDouble();
		Customer customer = new Customer();
		customer.setId(inp_id);
		customer.setName(inp_name);
		customer.setCity(inp_city);
		customer.setOutStandingAmount(inp_amt);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		boolean result = customerDAO.addCustomer(customer);
		if (result == true) {
			System.out.println("Row added successfully");
		}else {
			System.out.println("Row not added");
		}
	}

	public static void update() throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id to be updated");
		int inp_id = 0;
		String inp_name = null;
		String inp_city = null;
		double inp_amt = 0.0;
		inp_id = scanner.nextInt();
		System.out.println("Enter new name");
		inp_name = scanner.next();
		System.out.println("Enter new city");
		inp_city = scanner.next();
		System.out.println("Enter new Out-Standing-Amount");
		inp_amt = scanner.nextDouble();
		Customer customer = new Customer();
		customer.setId(inp_id);
		customer.setName(inp_name);
		customer.setCity(inp_city);
		customer.setOutStandingAmount(inp_amt);
		CustomerDAO customerDAO = new CustomerDAOImpl();
		boolean result = customerDAO.updateCustomer(customer);
		if (result == true) {
			System.out.println("Record successfully updated");
		}else {
			System.out.println("Record not updated");
		}
	}

	public static void remove() throws ClassNotFoundException, SQLException {
		System.out.println("Enter Id to Remove");
		int inp_id = 0;
		Scanner scanner =new Scanner(System.in);
		inp_id = scanner.nextInt();
		
		CustomerDAO customerDAO = new CustomerDAOImpl();
		boolean result = customerDAO.removeCustomer(inp_id);
		if (result == true) {
			System.out.println("Record Removed successfully");
		} else {
			System.out.println("Record Not Removed");
		}
	}

	public static void display() throws ClassNotFoundException, SQLException {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		List<Customer> customers = customerDAO.getAllCustomer();
		//System.out.println(customers);
		for (Customer customer : customers) {
			System.out.print(customer.getId() + "\t");
			System.out.print(customer.getName() + "\t");
			System.out.print(customer.getCity() + "\t");
			System.out.println(customer.getOutStandingAmount());
		}
	}
}
