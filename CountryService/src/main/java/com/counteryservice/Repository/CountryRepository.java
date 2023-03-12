package com.counteryservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.counteryservice.Entity.Countery;

public interface CountryRepository extends  JpaRepository<Countery, Long> {
	

}
