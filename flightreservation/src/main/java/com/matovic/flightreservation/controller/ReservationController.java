package com.matovic.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matovic.flightreservation.entities.Flight;
import com.matovic.flightreservation.repos.FlightRepository;

@Controller
public class ReservationController {
	
	@Autowired
	FlightRepository flightRepository;

	@RequestMapping("completeReservation")
	public String reservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {
		
		Flight flight = flightRepository.getOne(flightId);
		modelMap.addAttribute("flight", flight);
		
		return "completeReservation_p";
	}
}
