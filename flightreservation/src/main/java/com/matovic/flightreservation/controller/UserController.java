package com.matovic.flightreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matovic.flightreservation.entities.Flight;
import com.matovic.flightreservation.entities.User;
import com.matovic.flightreservation.repos.FlightRepository;
import com.matovic.flightreservation.repos.UserRepository;
import com.matovic.requests.Request;
import com.matovic.requests.Views;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private FlightRepository flightRepository;	
	
	@RequestMapping(Request.REGISTER)
	public String showRegistrationPage() {
		return Views.REGISTER;
	}
	
	@RequestMapping(Request.LOGIN)
	public String showLoginPage() {
		return Views.LOGIN;
	}
	
	
	@PostMapping(Request.DO_REGISTER)
	public String registerUser(@ModelAttribute("user") User user, 
			@RequestParam("confirmPassword") String confirmPassword, 
			ModelMap modelMap) {
		
		if(!user.getPassword().equals(confirmPassword)) {
			modelMap.addAttribute("msg", "Please retype password correctly.");
			return Views.REGISTER;
		}
		userRepository.save(user);
		return Views.LOGIN;
	}
	
	
	@PostMapping(Request.DO_LOGIN)
	public String showLoginPage(@RequestParam("email") String email, 
			@RequestParam("password") String password, 
			ModelMap modelMap) {
		
		
		User user = userRepository.findByEmail(email, password);
		modelMap.addAttribute("user", user);
		
		if(user==null) {
			modelMap.addAttribute("msg", "Invalid username or password. Please try again.");
			return Views.LOGIN;
		}
		
		List<Flight> flights = flightRepository.findAll();
		modelMap.addAttribute("flights", flights);
		return Views.FLIGHT_SEARCH;
	}
}
