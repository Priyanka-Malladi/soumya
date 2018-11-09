package com.cg.assignment1;

import javax.persistence.Embeddable;

@Embeddable
public class Qualification {
	private String nameOfQualification;
	private int experiance;
	
	
	public String getNameOfQualification() {
		return nameOfQualification;
	}
	public void setNameOfQualification(String nameOfQualification) {
		this.nameOfQualification = nameOfQualification;
	}
	public int getExperiance() {
		return experiance;
	}
	public void setExperiance(int experiance) {
		this.experiance = experiance;
	}
	@Override
	public String toString() {
		return "Qualification [nameOfQualification=" + nameOfQualification
				+ ", experiance=" + experiance + "]";
	}
	public Qualification(String nameOfQualification, int experiance) {
		super();
		this.nameOfQualification = nameOfQualification;
		this.experiance = experiance;
	}
	public Qualification() {
		super();
	}
	
	
	
	
	  
}
