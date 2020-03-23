package com.infospan.reservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infospan.reservation.entities.Flight;
import com.infospan.reservation.repos.FlightRepository;

@Controller
public class FlightController {

	@Autowired
	private FlightRepository repository;

	@RequestMapping("/searchFlight")
	public String findFlights(@RequestParam("departureCity") String from, @RequestParam("arrivalCity") String to,
			@RequestParam("dateOfDeparture") @DateTimeFormat(pattern = "MM-dd-yyyy") Date date, ModelMap modelMap) {

		List<Flight> flights = repository.findFlights(from,to,date);

		modelMap.addAttribute("flights", flights);

		return "login/show-flight";
	}
}