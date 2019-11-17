package com.matovic.flightreservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matovic.flightreservation.dto.ReservationRequest;
import com.matovic.flightreservation.entities.Flight;
import com.matovic.flightreservation.entities.Passenger;
import com.matovic.flightreservation.entities.Reservation;
import com.matovic.flightreservation.repos.FlightRepository;
import com.matovic.flightreservation.repos.PassengerRepository;
import com.matovic.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@Override
	public Reservation bookFlight(ReservationRequest reservationRequest) {
		
		//1. make payment
		
		//get Flight
		Long flightId = reservationRequest.getFlightId();
		Flight flight = flightRepository.getOne(flightId);
		
		//get passenger and save to db
		Passenger passenger = new Passenger(reservationRequest.getPassengerFirstName(), reservationRequest.getPassengerLastName(), "", reservationRequest.getPassengerEmail(), reservationRequest.getPassengerPhone());
		passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation(false, -1, passenger, flight);
		reservationRepository.save(reservation);
		
		return reservation;
	}

}
