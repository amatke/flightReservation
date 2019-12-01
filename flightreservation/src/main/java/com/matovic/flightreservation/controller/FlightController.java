package com.matovic.flightreservation.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matovic.flightreservation.entities.Flight;
import com.matovic.flightreservation.repos.FlightRepository;
import com.matovic.requests.Request;
import com.matovic.requests.Views;

@Controller
//@RequestMapping("/flights")
public class FlightController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@GetMapping(Request.SEARCH_FLIGHTS)
	public String findFlights(ModelMap modelMap) {
	
		modelMap.addAttribute("flights", flightRepository.findAll());	
		return Views.SEARCH_FLIGHTS;
	}

	@PostMapping(Request.SEARCH_FLIGHTS)
	public String findFlights(@RequestParam("from") String from,
			@RequestParam("to") String to,
			@RequestParam("date") String departureDate, 
			ModelMap modelMap) throws ParseException {
		
		Date parsedDate = null;
		if (!departureDate.isEmpty()) 
			parsedDate=new SimpleDateFormat("yyyy-MM-dd").parse(departureDate); 
		
		//System.err.println(from +"-"+ to +"-"+ departureDate);
		
		List<Flight> flights = flightRepository.findFlights(from, to, parsedDate);
		modelMap.addAttribute("flights", flights);
			
		return Views.FLIGHTS;
	}
}
