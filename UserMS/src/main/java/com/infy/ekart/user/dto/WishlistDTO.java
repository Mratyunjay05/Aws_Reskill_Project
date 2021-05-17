package com.infy.ekart.user.dto;

public class WishlistDTO {

	private BuyerDTO buyerDTO;
	
	private Integer prodId;

	public BuyerDTO getBuyerId() {
		return buyerDTO;
	}

	public void setBuyerId(BuyerDTO buyerDTO) {
		this.buyerDTO = buyerDTO;
	}

	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	
	

}


