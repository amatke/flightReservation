package com.matovic.flightcheckin.dto;

/*Ovo nam je dto (Data transfer object)*/
public class Reservation {

	private Long id;
	private boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;
	private Flight flight;

	public Reservation() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}

	public int getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reservation [id=");
		builder.append(id);
		builder.append(", checkedIn=");
		builder.append(checkedIn);
		builder.append(", numberOfBags=");
		builder.append(numberOfBags);
		builder.append(", passenger=");
		builder.append(passenger);
		builder.append(", flight=");
		builder.append(flight);
		builder.append("]");
		return builder.toString();
	}

}
