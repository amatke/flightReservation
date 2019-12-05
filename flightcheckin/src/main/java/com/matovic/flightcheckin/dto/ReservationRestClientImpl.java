package com.matovic.flightcheckin.dto;

import org.springframework.web.client.RestTemplate;

import com.matovic.flightcheckin.integration.ReservationRestClient;

public class ReservationRestClientImpl implements ReservationRestClient {

	@Override
	public Reservation findReservation(Long id) {
		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate
				.getForObject("http://localhost:8080/flightreservation/reservations/" + id, Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
