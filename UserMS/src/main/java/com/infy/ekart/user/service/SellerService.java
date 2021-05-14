package com.infy.ekart.user.service;

import com.infy.ekart.user.dto.SellerDTO;

public interface SellerService {
	public SellerDTO loginSeller(String email, String password);
	
	public String registerSeller(SellerDTO buyer); 
}
