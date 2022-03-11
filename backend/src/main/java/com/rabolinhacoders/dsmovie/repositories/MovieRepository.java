package com.rabolinhacoders.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rabolinhacoders.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
	

}
