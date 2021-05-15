package com.infy.ekart.user.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.infy.ekart.user.entity.Buyer;

public interface BuyerRepository extends CrudRepository<Buyer , Integer> {
	
	public Buyer findByEmail(String email);
	
	//public Buyer deleteByEmail(String email);
}
