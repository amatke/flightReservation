package com.matovic.flightcheckin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClientException;

import com.matovic.flightcheckin.dto.Reservation;
import com.matovic.flightcheckin.dto.ReservationUpdateRequest;
import com.matovic.flightcheckin.integration.ReservationRestClient;

@Controller
public class CheckinController {

	@Autowired
	private ReservationRestClient reservationRestClient;
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}
	
	
	@RequestMapping("/findReservation")
	public String checkIn(@RequestParam("reservationId") Long reservationId, ModelMap modelMap) {
		
		Reservation reservation = null;

		try {
			reservation = reservationRestClient.findReservation(reservationId);
		} catch (HttpServerErrorException e) {
			e.getMessage();
		}
		
		if(reservation == null) {
			modelMap.addAttribute("notFound", "There is no reservation found with id: " + reservationId);
			return "index";
		} else if( reservation.isCheckedIn()) {
			modelMap.addAttribute("notFound", "You already checked. <br> " + reservation);
			return "index";
		}
		modelMap.addAttribute("reservation", reservation);
		
		return "checkIn-page";
	}
	
	
	@RequestMapping("/checkIn")
	public String checkIn(@RequestParam("reservationId") int reservationId, 
			@RequestParam("numOfBags") int numOfBags, 
			ModelMap modelMap) {
		
		modelMap.addAttribute("finish", "You successfully checked in!");
		
		ReservationUpdateRequest request = new ReservationUpdateRequest(reservationId, true, numOfBags);
		reservationRestClient.updateReservation(request);
		
		return "index";
	}
}
