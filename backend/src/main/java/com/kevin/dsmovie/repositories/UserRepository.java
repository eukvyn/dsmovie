package com.kevin.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevin.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByEmail(String email);
}
