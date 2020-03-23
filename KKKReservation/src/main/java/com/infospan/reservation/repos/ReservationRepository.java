package com.infospan.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infospan.reservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
