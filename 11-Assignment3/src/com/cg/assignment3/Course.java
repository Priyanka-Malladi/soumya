package com.cg.assignment3;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



import javax.persistence.Table;

import com.trainee.client.Entity;
@Entity
@Table(name="course1")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int c_id;
	private String c_name;
	@OneToOne(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "f_id")
	private FeeDetails feeDetails;
	
	
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
