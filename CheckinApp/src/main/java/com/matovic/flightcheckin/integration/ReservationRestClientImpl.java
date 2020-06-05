package com.matovic.flightcheckin.integration;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.matovic.flightcheckin.dto.Reservation;
import com.matovic.flightcheckin.dto.ReservationUpdateRequest;

@Component
public class ReservationRestClientImpl implements ReservationRestClient{

	static final String RESERVATION_REST_URL = "http://localhost:8080/flightReservation/reservations";
	
	@Override
	public Reservation findReservation (Long ReservationId) {

		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.getForObject(RESERVATION_REST_URL + "/" + ReservationId, Reservation.class);
		
		return reservation;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {

		RestTemplate restTemplate = new RestTemplate();
		Reservation reservation = restTemplate.postForObject(RESERVATION_REST_URL, request, Reservation.class);
		
		return reservation;
	}

}
