package com.infy.ekart.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.ekart.user.entity.Wishlist;
import com.infy.ekart.user.entity.WishlistId;

public interface WishlistRepository extends CrudRepository<Wishlist,WishlistId> {

	public Wishlist findByBuyerIdAndProdId(Integer buyerId,Integer prodId);
	
}
