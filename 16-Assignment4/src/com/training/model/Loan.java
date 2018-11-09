package com.training.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Loan {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int loanId;
	private String customerName;
	private double loanAmount;
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Repayment> repaymentsList = new ArrayList<Repayment>();

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public List<Repayment> getRepaymentsList() {
		return repaymentsList;
	}

	public void setRepaymentsList(List<Repayment> repaymentsList) {
		this.repaymentsList = repaymentsList;
	}

	@Override
	public String toString() {
		return "Loan [loanId=" + loanId + ", customerName=" + customerName
				+ ", loanAmount=" + loanAmount + ", repaymentsList="
				+ repaymentsList + "]";
	}
	
	public void addRepayment(Repayment rep){
		this.repaymentsList.add(rep);
	}
}
