package com.matovic.flightcheckin.dto;

public class ReservationUpdateRequest {

	private long id;
	private boolean checkedIn;
	private int numOfBags;

	public ReservationUpdateRequest() {
	}

	public ReservationUpdateRequest(long id, boolean checkedIn, int numOfBags) {
		this.id = id;
		this.checkedIn = checkedIn;
		this.numOfBags = numOfBags;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumOfBags() {
		return numOfBags;
	}

	public void setNumOfBags(int numOfBags) {
		this.numOfBags = numOfBags;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReservationUpdateRequest [id=");
		builder.append(id);
		builder.append(", checkedIn=");
		builder.append(checkedIn);
		builder.append(", numOfBags=");
		builder.append(numOfBags);
		builder.append("]");
		return builder.toString();
	}

}
