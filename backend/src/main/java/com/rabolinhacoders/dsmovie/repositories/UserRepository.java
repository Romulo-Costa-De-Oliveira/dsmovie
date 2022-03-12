package com.rabolinhacoders.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabolinhacoders.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
