package com.cg.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.business.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public boolean addCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionManager.createConnection();
		String sql = "insert into Customer values(?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, customer.getId());
		statement.setString(2, customer.getName());
		statement.setString(3, customer.getCity());
		statement.setDouble(4, customer.getOutStandingAmount());
		int r = statement.executeUpdate();
		if (r > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean removeCustomer(int customerId) throws ClassNotFoundException, SQLException {
		
		Connection connection = ConnectionManager.createConnection();
		String sql = "delete from Customer where c_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, customerId);
		int r = statement.executeUpdate();
		if (r > 0) {
			return true;
		} 
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionManager.createConnection();
		String sql = "update Customer set c_name = ?, c_city = ?c_amt = ? where c_id = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, customer.getName());
		statement.setString(2, customer.getCity());
		statement.setDouble(3, customer.getOutStandingAmount());
		statement.setInt(4, customer.getId());
		int r = statement.executeUpdate();
		if (r > 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean FindCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> getAllCustomer() throws ClassNotFoundException, SQLException {
		Connection connection = ConnectionManager.createConnection();
		String sql = "select * from Customer";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		List<Customer> customers = new ArrayList<>();
		while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String city = rs.getString(3);
			double amount = rs.getDouble(4);
			Customer customer = new Customer();
			customer.setId(id);
			customer.setName(name);
			customer.setCity(city);
			customer.setOutStandingAmount(amount);
			customers.add(customer);
		}
		
		ConnectionManager.closeConnection(connection);
		return customers;
	}

}
