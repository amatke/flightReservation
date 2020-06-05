package com.matovic.flightcheckin.integration;

import com.matovic.flightcheckin.dto.Reservation;
import com.matovic.flightcheckin.dto.ReservationUpdateRequest;

/*Obezbedjuje pozive ka nasem web servisu*/
public interface ReservationRestClient {

	public Reservation findReservation(Long ReservationId);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
