package com.infy.ekart.user.entity;

import java.io.Serializable;

public class WishlistId implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer prodId;
	
	private Integer buyerId;

	public Integer getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Integer buyerId) {
		this.buyerId = buyerId;
	}


	public Integer getProdId() {
		return prodId;
	}

	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}

	
}
