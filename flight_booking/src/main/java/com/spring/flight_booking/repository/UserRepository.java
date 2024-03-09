package com.spring.flight_booking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.flight_booking.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	Boolean existsByUsername(String username);

	UserEntity findByUsername(String username);

}
