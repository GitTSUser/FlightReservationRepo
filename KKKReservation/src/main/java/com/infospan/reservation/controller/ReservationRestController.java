package com.infospan.reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infospan.reservation.dto.ReservationUpdateRequest;
import com.infospan.reservation.entities.Reservation;
import com.infospan.reservation.repos.ReservationRepository;

@RestController
public class ReservationRestController {

	@Autowired
	ReservationRepository reservationRepository;

	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {

		return reservationRepository.getOne(id);
	}

	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepository.getOne(request.getId());

		reservation.setCheckedIn(request.getCheckedIn());
		reservation.setNumberOfBags(request.getNumberOfBags());

		Reservation updatedReservation = reservationRepository.save(reservation);

		return updatedReservation;
	}
}