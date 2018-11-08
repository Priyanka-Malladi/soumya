package com.cg.db;

import java.sql.SQLException;
import java.util.List;

import com.cg.business.Customer;

public interface CustomerDAO {

	boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException;

	boolean removeCustomer(int customerId) throws ClassNotFoundException, SQLException;

	boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException;

	boolean FindCustomer(int customerId);

	List<Customer> getAllCustomer() throws ClassNotFoundException, SQLException;
}
