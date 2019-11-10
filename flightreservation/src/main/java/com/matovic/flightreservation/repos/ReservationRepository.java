package com.matovic.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matovic.flightreservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
