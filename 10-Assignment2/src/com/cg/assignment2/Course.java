package com.cg.assignment2;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int c_id;
	private String c_name;
	@OneToOne(cascade=CascadeType.ALL)
	FeeDetails feeDetails;
	
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public FeeDetails getFeeDetails() {
		return feeDetails;
	}
	public void setFeeDetails(FeeDetails feeDetails) {
		this.feeDetails = feeDetails;
	}
	
	
}
