package com.infy.ekart.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.infy.ekart.user.dto.SellerDTO;
import com.infy.ekart.user.exception.EkartException;
import com.infy.ekart.user.service.SellerService;

@RestController
@RequestMapping(value = "/Seller")
public class SellerController {

	@Autowired
	private SellerService sellerService;
	

	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ResponseEntity<SellerDTO> buyerLogin(@RequestBody SellerDTO seller) throws EkartException{
			
		SellerDTO sellerServ =  sellerService.loginSeller(seller.getEmail(), seller.getPassword());
		return new ResponseEntity<>(sellerServ, HttpStatus.OK);
		
	}
	
}
