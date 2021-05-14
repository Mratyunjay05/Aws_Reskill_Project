package com.infy.ekart.user.service;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.ekart.user.dto.BuyerDTO;
import com.infy.ekart.user.repository.BuyerRepository;

@Service(value = "buyerService")
@Transactional
public class BuyerServiceImpl {
	
	@Autowired
	private BuyerRepository buyerRepository;
	
	
	
}
