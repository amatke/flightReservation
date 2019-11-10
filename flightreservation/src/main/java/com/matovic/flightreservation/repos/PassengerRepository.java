package com.matovic.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matovic.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
