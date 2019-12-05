package com.matovic.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matovic.flightreservation.dto.ReservationUpdateRequest;
import com.matovic.flightreservation.entities.Reservation;
import com.matovic.flightreservation.repos.ReservationRepository;

@RestController
@CrossOrigin  // neophodno za komunikaciju sa angularom (tj generalno medjusobnu komunikaciju)
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		return reservationRepository.findById(id).get();
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		
		Reservation reservation = reservationRepository.findById(request.getId()).get(); 
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.isCheckedIn());
		
		return reservationRepository.save(reservation);
	}
}
