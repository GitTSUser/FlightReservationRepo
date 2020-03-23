package com.infospan.reservation.services;

import com.infospan.reservation.controller.ReservationRequest;
import com.infospan.reservation.entities.Reservation;

public interface ReservationService {

	Reservation bookFlight(ReservationRequest request);
}
