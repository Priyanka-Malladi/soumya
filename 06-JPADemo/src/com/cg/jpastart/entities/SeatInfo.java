package com.cg.jpastart.entities;

import javax.persistence.Embeddable;

@Embeddable
public class SeatInfo {
	int totalSeatCount;
	int availableSeatCount;
	int bookedSeatCount;
	public int getTotalSeatCount() {
		return totalSeatCount;
	}
	public void setTotalSeatCount(int totalSeatCount) {
		this.totalSeatCount = totalSeatCount;
	}
	public int getAvailableSeatCount() {
		return availableSeatCount;
	}
	public void setAvailableSeatCount(int availableSeatCount) {
		this.availableSeatCount = availableSeatCount;
	}
	public int getBookedSeatCount() {
		return bookedSeatCount;
	}
	public void setBookedSeatCount(int bookedSeatCount) {
		this.bookedSeatCount = bookedSeatCount;
	}
	@Override
	public String toString() {
		return "SeatInfo [totalSeatCount=" + totalSeatCount
				+ ", availableSeatCount=" + availableSeatCount
				+ ", bookedSeatCount=" + bookedSeatCount + "]";
	}
	public SeatInfo(int totalSeatCount, int availableSeatCount,
			int bookedSeatCount) {
		super();
		this.totalSeatCount = totalSeatCount;
		this.availableSeatCount = availableSeatCount;
		this.bookedSeatCount = bookedSeatCount;
	}
	public SeatInfo() {
		super();
	}

	
	
}
