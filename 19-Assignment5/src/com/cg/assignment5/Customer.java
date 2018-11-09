package com.cg.assignment5;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Customer {
	@ManyToMany(fetch=FetchType.LAZY,mappedBy="customerList")
	private List<Bank> bankList = new ArrayList<Bank>();
	@Id
	private int id;
	private String name;
	
	private Date dob;
	
	
	public List<Bank> getBankList() {
		return bankList;
	}
	public void setBankList(List<Bank> bankList) {
		this.bankList = bankList;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	/*@Override
	public String toString() {
		return "Customer [bankList=" + bankList + ", id=" + id + ", name="
				+ name + ", dob=" + dob + "]";
	}
	*/
	public void addBank(Bank bank){
		this.bankList.add(bank);
	}
	
	
}
