package com.cg.assignment5;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Bank {
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "bank_customer", joinColumns = { @JoinColumn(name = "bank_id") }, inverseJoinColumns = { @JoinColumn(name = "customer_id") })
	private List<Customer> customerList = new ArrayList<Customer>();
	@Id
	private int id;
	private String name;
	private String bankOfficeLocation;
	
	
	public List<Customer> getCustomerList() {
		return customerList;
	}
	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBankOfficeLocation() {
		return bankOfficeLocation;
	}
	public void setBankOfficeLocation(String bankOfficeLocation) {
		this.bankOfficeLocation = bankOfficeLocation;
	}
	/*@Override
	public String toString() {
		return "Bank [customerList=" + customerList + ", id=" + id + ", name="
				+ name + ", bankOfficeLocation=" + bankOfficeLocation + "]";
	}*/
	
	public void addCustomer(Customer cust) {
		this.customerList.add(cust);
	}
	
}
