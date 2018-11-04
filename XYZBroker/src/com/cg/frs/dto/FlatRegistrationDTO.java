package com.cg.frs.dto;

public class FlatRegistrationDTO {
	private int ownerId;
	private int flatId;
	private String flatType;
	private int flatArea;
	private double rent;
	private double deposit;
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public int getFlatId() {
		return flatId;
	}
	public void setFlatId(int flatId) {
		this.flatId = flatId;
	}
	public String getFlatType() {
		return flatType;
	}
	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(Double rent) {
		this.rent = rent;
	}
	public Double getDeposit() {
		return deposit;
	}
	public void setDeposit(Double deposit) {
		this.deposit = deposit;
	}
	
	
	
}
