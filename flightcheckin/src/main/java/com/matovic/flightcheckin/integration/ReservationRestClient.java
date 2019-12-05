package com.matovic.flightcheckin.integration;

import com.matovic.flightcheckin.dto.Reservation;
import com.matovic.flightcheckin.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(Long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
