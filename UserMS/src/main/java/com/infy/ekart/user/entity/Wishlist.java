//package com.infy.ekart.user.entity;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToOne;
//
//@Entity
//public class Wishlist {
//	
//	@OneToOne(cascade=CascadeType.REFRESH)
//	@JoinColumn(name="buyer_id")
//	private Buyer buyerId;
//	
//	private Integer prodId;
//
//	public Buyer getBuyerId() {
//		return buyerId;
//	}
//
//	public void setBuyerId(Buyer buyerId) {
//		this.buyerId = buyerId;
//	}
//
//	public Integer getProdId() {
//		return prodId;
//	}
//
//	public void setProdId(Integer prodId) {
//		this.prodId = prodId;
//	}
//	
//	
//}
