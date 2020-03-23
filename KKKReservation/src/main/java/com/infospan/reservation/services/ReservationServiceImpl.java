package com.infospan.reservation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infospan.reservation.controller.ReservationRequest;
import com.infospan.reservation.entities.Flight;
import com.infospan.reservation.entities.Passenger;
import com.infospan.reservation.entities.Reservation;
import com.infospan.reservation.repos.FlightRepository;
import com.infospan.reservation.repos.PassengerRepository;
import com.infospan.reservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private ReservationRepository reservationRepository;

	@Autowired
	private PassengerRepository passengerRepository;

	@Override
	public Reservation bookFlight(ReservationRequest request) {

		Long flightId = request.getFlightId();
		Flight flight = flightRepository.findById(flightId).get();

		Passenger p = new Passenger();
		p.setFirstName(request.getPassengerFirstName());
		p.setLastName(request.getPassengerLastName());
		p.setEmail(request.getPassengerEmail());
		p.setPhone(request.getPassengerPhone());

		Passenger savedPassenger = passengerRepository.save(p);

		Reservation r = new Reservation();
		r.setFlight(flight);
		r.setPassenger(savedPassenger);
		r.setCheckedIn(false);

		Reservation savedReservation = reservationRepository.save(r);

		return savedReservation;
	}
}