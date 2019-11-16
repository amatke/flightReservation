package com.matovic.flightreservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matovic.flightreservation.entities.Flight;
import com.matovic.flightreservation.repos.FlightRepository;

@Controller("flights")
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;

	@PostMapping("search")
	public String findFlights(@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("date") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, 
			ModelMap modelMap) {
		
		System.err.println(from);
		System.err.println(to);
		System.err.println(departureDate);
		
		//List<Flight> flights = flightRepository.findFlights(from, to, departureDate);
		//modelMap.addAttribute("flights", flights);
		
		return "login/login_p";
	}
}
