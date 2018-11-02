package com.cg.soumya.bean;

public class TransportBean {
	private int id;
	private String transportCatigoryId;
	private String reason;
	private String when;
	private String status = "new";
	
	//setter getter
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTransportCatigoryId() {
		return transportCatigoryId;
	}
	public void setTransportCatigoryId(String transportCatigoryId) {
		this.transportCatigoryId = transportCatigoryId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

	
	
}
