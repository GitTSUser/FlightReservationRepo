package com.infospan.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infospan.reservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger,Long> {

}
