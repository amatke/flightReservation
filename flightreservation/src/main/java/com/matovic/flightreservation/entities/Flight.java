package com.matovic.flightreservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends AbstractEntity{


	private String flightNumber;
	private String operatinAirlines;
	private String departureCity;
	private String arrivalCity;
	private Date dateOfDeparture;
	private Timestamp estimatedDepartureTime;

	public Flight() {
	}

	public Flight(String flightNumber, String operatinAirlines, String departureCity, String arrivalCity,
			Date dateOfDeparture, Timestamp estimatedDepartureTime) {
		super();
		this.flightNumber = flightNumber;
		this.operatinAirlines = operatinAirlines;
		this.departureCity = departureCity;
		this.arrivalCity = arrivalCity;
		this.dateOfDeparture = dateOfDeparture;
		this.estimatedDepartureTime = estimatedDepartureTime;
	}


	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatinAirlines() {
		return operatinAirlines;
	}

	public void setOperatinAirlines(String operatinAirlines) {
		this.operatinAirlines = operatinAirlines;
	}

	public String getDepartureCity() {
		return departureCity;
	}

	public void setDepartureCity(String departureCity) {
		this.departureCity = departureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDeparture() {
		return dateOfDeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateOfDeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedDepartureTime() {
		return estimatedDepartureTime;
	}

	public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
		this.estimatedDepartureTime = estimatedDepartureTime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Flight [id=");
		builder.append(super.getId());
		builder.append(", flightNumber=");
		builder.append(flightNumber);
		builder.append(", operatinAirlines=");
		builder.append(operatinAirlines);
		builder.append(", departureCity=");
		builder.append(departureCity);
		builder.append(", arrivalCity=");
		builder.append(arrivalCity);
		builder.append(", dateOfDeparture=");
		builder.append(dateOfDeparture);
		builder.append(", estimatedDepartureTime=");
		builder.append(estimatedDepartureTime);
		builder.append("]");
		return builder.toString();
	}

}
