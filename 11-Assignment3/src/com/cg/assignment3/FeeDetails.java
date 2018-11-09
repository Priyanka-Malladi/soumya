package com.cg.assignment3;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.trainee.client.Column;
import com.trainee.client.Entity;
@Entity
@Table(name="FeeDetails1")
public class FeeDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int f_id;
	private double totalFee;
	private int numberOfInstalment;
	@OneToOne(mappedBy="FeeDetails")
	private Course course;
	
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
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
}
