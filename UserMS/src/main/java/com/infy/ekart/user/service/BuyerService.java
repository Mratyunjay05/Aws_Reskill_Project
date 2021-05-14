package com.infy.ekart.user.service;

import com.infy.ekart.user.dto.BuyerDTO;

public interface BuyerService {
	public BuyerDTO loginBuyer(String email, String password);
	
	public String registerBuyer(BuyerDTO buyer); 
}
