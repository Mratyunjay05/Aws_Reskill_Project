package com.infy.ekart.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.ekart.user.dto.BuyerDTO;
import com.infy.ekart.user.dto.WishlistDTO;
import com.infy.ekart.user.entity.Wishlist;
import com.infy.ekart.user.exception.EkartException;
import com.infy.ekart.user.repository.WishlistRepository;

@Service(value = "wishlistService")
@Transactional
public class WishlistServiceImpl implements WishlistService{

	@Autowired
	private WishlistRepository wishlistRepository;
	
	@Override
	public String addProduct(WishlistDTO wishlist) throws EkartException {
		
		Wishlist wishlistEntity = new Wishlist();
		wishlistEntity.setBuyerId(wishlist.getBuyerId());
		wishlistEntity.setProdId(wishlist.getProdId());
		
		wishlistRepository.save(wishlistEntity);
		
		return "your product";
	}
	

}
