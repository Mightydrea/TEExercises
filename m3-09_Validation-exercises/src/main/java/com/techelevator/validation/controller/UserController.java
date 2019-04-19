package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String getRegistrationScreen(ModelMap map) {
		
		if (!map.containsAttribute("registration")) {
			map.addAttribute("registration", new Registration());
		}

		return "register";
	}

	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)
	@RequestMapping(path ="/register", method = RequestMethod.POST)
	public String submitRegistration(@Valid @ModelAttribute("registration") Registration registration,
			BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "register";
		}
		attr.addFlashAttribute("register", registration);
		
		return "redirect:/registrationConfirmation";
		}

	// GET: /login
	// Return the empty login view
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String diplayLoginScreen(ModelMap map) {

		if (!map.containsAttribute("login")) {
			map.addAttribute("login", new Login());
		}

		return "login";
	}

	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String submitLogin(@Valid @ModelAttribute("login") Login login,
			BindingResult result, RedirectAttributes attr) {

	
	if(result.hasErrors()) {
		return "login";
	}
	attr.addFlashAttribute("login", login);
	
	return "redirect:/confirmation";
	}

	// GET: /confirmation
	// Return the confirmation view
	@RequestMapping(path = "/confirmation", method = RequestMethod.GET)
	public String diplayConfirmationScreen(ModelMap map) {

		if(! map.containsAttribute("login")) {
			// If it does not exist, we create an empty object to avoid the NullPointerException and place
			// that is our modelMap for the View to use. 
			map.addAttribute("login", new Login());
		} 
		
		return "confirmation";
	}

}