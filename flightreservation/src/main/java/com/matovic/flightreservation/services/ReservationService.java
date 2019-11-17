package com.matovic.flightreservation.services;

import com.matovic.flightreservation.dto.ReservationRequest;
import com.matovic.flightreservation.entities.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest reservationRequest);
}
