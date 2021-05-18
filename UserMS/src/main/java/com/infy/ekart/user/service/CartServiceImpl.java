package com.infy.ekart.user.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.ekart.user.dto.CartDTO;
import com.infy.ekart.user.entity.Cart;
import com.infy.ekart.user.exception.EkartException;
import com.infy.ekart.user.repository.CartRepository;
@Service(value = "cartService")
@Transactional
public class CartServiceImpl implements CartService {
	@Autowired
	CartRepository cartRepository;
	@Override
	public String addProduct(CartDTO cartDTO) throws EkartException {

		Cart cartEntity = new Cart();
		
		cartEntity.setBuyerId(cartDTO.getBuyerId());
		cartEntity.setProdId(cartDTO.getProdId());
		cartEntity.setQuantity(cartDTO.getQuantity());
		
		cartRepository.save(cartEntity);
		
		return "your Prouduct ";
	
	}

}
