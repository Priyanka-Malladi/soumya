package com.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Repayment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int repaymentId;
	private double repayAmount;
	private int instalmentNo;
	public int getRepaymentId() {
		return repaymentId;
	}
	public void setRepaymentId(int repaymentId) {
		this.repaymentId = repaymentId;
	}
	public double getRepayAmount() {
		return repayAmount;
	}
	public void setRepayAmount(double repayAmount) {
		this.repayAmount = repayAmount;
	}
	public int getInstalmentNo() {
		return instalmentNo;
	}
	public void setInstalmentNo(int instalmentNo) {
		this.instalmentNo = instalmentNo;
	}
	@Override
	public String toString() {
		return "Repayment [repaymentId=" + repaymentId + ", repayAmount="
				+ repayAmount + ", instalmentNo=" + instalmentNo + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + repaymentId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Repayment other = (Repayment) obj;
		if (repaymentId != other.repaymentId)
			return false;
		return true;
	}
	public Repayment(int repaymentId, double repayAmount, int instalmentNo) {
		super();
		this.repaymentId = repaymentId;
		this.repayAmount = repayAmount;
		this.instalmentNo = instalmentNo;
	}
	public Repayment() {
		super();
	}
	
	
	
}
