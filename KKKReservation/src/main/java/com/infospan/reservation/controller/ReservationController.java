package com.infospan.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.infospan.reservation.entities.Flight;
import com.infospan.reservation.entities.Reservation;
import com.infospan.reservation.repos.FlightRepository;
import com.infospan.reservation.services.ReservationService;

@Controller
public class ReservationController {

	@Autowired
	private FlightRepository repository;

	@Autowired
	private ReservationService service;

	@RequestMapping("/showReservation")
	public String showReservation(@RequestParam("flightId") Long flightId, ModelMap modelMap) {

		Flight flight = repository.findById(flightId).get();

		modelMap.addAttribute("f", flight);

		return "login/reservation";
	}

	@RequestMapping(value = "/completeReservation", method = RequestMethod.POST)
	public String completeReservation(ReservationRequest request, ModelMap modelMap) {

		Reservation reservation = service.bookFlight(request);

		modelMap.addAttribute("reservationStatus", "Reservation is successfully done with the id:" + reservation.getId());
		
		return "login/confirm-reservation";
	}
}