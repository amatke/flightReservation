package com.matovic.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matovic.flightreservation.dto.ReservationRequest;
import com.matovic.flightreservation.entities.Flight;
import com.matovic.flightreservation.entities.Reservation;
import com.matovic.flightreservation.repos.FlightRepository;
import com.matovic.flightreservation.services.ReservationService;
import com.matovic.requests.Request;
import com.matovic.requests.Views;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	ReservationService reservationService;

	@RequestMapping(Request.COMPLETING_RESERVATION)
	public String reservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		Flight flight = flightRepository.getOne(flightId);
		modelMap.addAttribute("flight", flight);
		
		return Views.COMPLETING_RESERVATION;
	}
	
	
	
	@PostMapping(Request.CONFIRMING_RESERVATION)
	public String continuReservation(ReservationRequest request, ModelMap modelMap) {
		
		Reservation reservation = reservationService.bookFlight(request);
		modelMap.addAttribute("msg", "Succesfully created Reservation! Reservation id is " + reservation.getId() );
		
		return Views.CONFIRMING_RESERVATION;
	}
}
