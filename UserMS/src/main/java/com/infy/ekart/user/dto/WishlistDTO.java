package com.infy.ekart.user.dto;

import com.infy.ekart.user.entity.Wishlist;

public class WishlistDTO {

//	private BuyerDTO buyer;
	
	private Integer prodId;
	
	private Integer buyerId;

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}

//	public BuyerDTO getBuyer() {
//		return buyer;
//	}
//
//	public void setBuyer(BuyerDTO buyer) {
//		this.buyer = buyer;
//	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	
//	public Wishlist createEntity() {
//		
//		Wishlist wish = new Wishlist();
//		wish.setBuyerId(this.buyerId);
//		wish.setProdId(this.prodId);
//		
//		return wish;
//		
//	}

}


