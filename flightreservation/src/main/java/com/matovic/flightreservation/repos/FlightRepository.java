package com.matovic.flightreservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.matovic.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query("from Flight where departureCity=:DEPARTURE_CITY and arrivalCity=:ARRIVAL_CITY and dateOfDeparture=:DATE_OF_DEPARTURE")
	List<Flight> findFlights(@Param("DEPARTURE_CITY") String from, @Param("ARRIVAL_CITY") String to, @Param("DATE_OF_DEPARTURE") Date departureDate);

}
