package com.infy.ekart.user.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.infy.ekart.user.dto.BuyerDTO;

@Entity
@Table(name="wishlist")
public class Wishlist {
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="buyer_id",unique=true)
//	private BuyerDTO buyer;
	@Id
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
	
	
}
