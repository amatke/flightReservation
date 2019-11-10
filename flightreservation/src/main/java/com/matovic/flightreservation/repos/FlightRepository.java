package com.matovic.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matovic.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
