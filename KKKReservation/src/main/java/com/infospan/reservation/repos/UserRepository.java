package com.infospan.reservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.infospan.reservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	@Query("from User where email=:email")
	User findByEmail(@Param("email") String email);

}