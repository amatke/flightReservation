package com.matovic.flightreservation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matovic.flightreservation.entities.Flight;
import com.matovic.flightreservation.repos.FlightRepository;

@Controller
//@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;

	@PostMapping("search")
	public String findFlights(@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("date") String departureDate, 
			ModelMap modelMap) throws ParseException {
		
		Date parsedDate = null;
		if (!departureDate.isEmpty()) 
			parsedDate=new SimpleDateFormat("yyyy-MM-dd").parse(departureDate); 
		
		System.err.println(from);
		System.err.println(to);
		System.err.println(departureDate);
		
		List<Flight> flights = flightRepository.findFlights(from, to, parsedDate);
		modelMap.addAttribute("flights", flights);
		
	
		return "flights_p";
	}
}
