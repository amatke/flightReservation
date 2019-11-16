package com.matovic.flightreservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.matovic.flightreservation.entities.User;
import com.matovic.flightreservation.repos.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/register_p";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login_p";
	}
	
	
	@PostMapping("/registration")
	public String registerUser(@ModelAttribute("user") User user, 
			@RequestParam("confirmPassword") String confirmPassword, 
			ModelMap modelMap) {
		
		if(!user.getPassword().equals(confirmPassword)) {
			modelMap.addAttribute("msg", "Please retype password correctly.");
			return "login/register_p";
		}
		userRepository.save(user);
		return "login/login_p";
	}
	
	
	@PostMapping("/login")
	public String showLoginPage(@RequestParam("email") String email, 
			@RequestParam("password") String password, 
			ModelMap modelMap) {
		
		
		User user = userRepository.findByEmail(email);
		
		if(!user.getPassword().equals(password)) {
			modelMap.addAttribute("msg", "Invalid username or password. Please try again.");
			return "login/login_p";
		}
		return "findFlights_p";
	}
}
