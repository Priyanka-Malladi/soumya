package com.cg.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
	
	public static Connection createConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String dbURL = "jdbc:mysql://localhost:3306/demodb";
		String userName = "root";
		String password = "pass"; 
		Connection connection = DriverManager.getConnection(dbURL, userName, password);
		return connection;
	}
	public static void insertRecord() throws ClassNotFoundException, SQLException{
		Connection connection = createConnection();
		System.out.println("Connected Succesfully");
		String sql = "insert into Customer values(5, 'Varun Traders', 'Pune' , 9000.00)";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(sql);
		System.out.println(r + "rows inserted");
		statement.close();
		connection.close();
	}
	public static void updateRecord() throws ClassNotFoundException, SQLException{
		Connection connection = createConnection();
		System.out.println("Connected Succesfully");
		String sql = "update Customer set c_amt = c_amt + 2000 where c_id = 1";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(sql);
		System.out.println(r + "rows inserted");
		statement.close();
		connection.close();
	}
	public static void deleteRecord() throws ClassNotFoundException, SQLException{
		Connection connection = createConnection();
		System.out.println("Connected Succesfully");
		String sql = "delete from Customer where c_id = 5";
		Statement statement = connection.createStatement();
		int r = statement.executeUpdate(sql);
		System.out.println(r + "rows inserted");
		statement.close();
		connection.close();
	}
	public static void readAllRecord() throws ClassNotFoundException, SQLException{
		Connection connection = createConnection();
		System.out.println("Connected Succesfully");
		String sql = "select * from Customer";
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		while (rs.next()) {
			System.out.print(rs.getInt(1)+"\t" );
			System.out.print(rs.getString(2)+"\t\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.println(rs.getDouble(4)+"\t");
		} 
		//System.out.println(rs + "rows inserted");
		rs.close();
		statement.close();
		connection.close();
	}
	public static void readOneRecord(int id) throws ClassNotFoundException, SQLException{
		Connection connection = createConnection();
		System.out.println("Connected Succesfully");
		String sql = "select * from Customer where c_id = " + id;
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		if (rs.next()) {
			System.out.print(rs.getInt(1)+"\t" );
			System.out.print(rs.getString(2)+"\t");
			System.out.print(rs.getString(3)+"\t");
			System.out.println(rs.getDouble(4)+"\t");
		}
		//System.out.println(rs + "rows inserted");
		rs.close();
		statement.close();
		connection.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//insertRecord();
		//updateRecord();
		//deleteRecord();
		//readAllRecord();
		readOneRecord(3);
	}
}
