package com.cg.assignment2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeeDetails {
	@Id
	private int f_id;
	private double totalFee;
	private int numberOfInstalment;
	
	
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public double getTotalFee() {
		return totalFee;
	}
	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}
	public int getNumberOfInstalment() {
		return numberOfInstalment;
	}
	public void setNumberOfInstalment(int numberOfInstalment) {
		this.numberOfInstalment = numberOfInstalment;
	}
	
	
}
