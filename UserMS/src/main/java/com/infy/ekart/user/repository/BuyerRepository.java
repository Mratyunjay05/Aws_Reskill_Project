package com.infy.ekart.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.ekart.user.entity.Buyer;

public interface BuyerRepository extends CrudRepository<Buyer , Integer> {
	public Buyer findByPhoneNumber(String phoneNumber);
}
