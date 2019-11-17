package com.matovic.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.matovic.flightreservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("from User where email=:EMAIL and password=:PASS")
	User findByEmail(@Param("EMAIL") String email, @Param("PASS") String password);

}
