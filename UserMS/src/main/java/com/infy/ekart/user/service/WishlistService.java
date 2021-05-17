package com.infy.ekart.user.service;

import com.infy.ekart.user.dto.BuyerDTO;
import com.infy.ekart.user.dto.WishlistDTO;
import com.infy.ekart.user.exception.EkartException;

public interface WishlistService {

	public String addProduct(WishlistDTO wishlist) throws EkartException;
	
}
