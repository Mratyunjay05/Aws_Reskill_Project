package com.infy.ekart.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infy.ekart.product.dto.ProductDTO;
import com.infy.ekart.product.exception.ProductException;
import com.infy.ekart.product.service.ProductService;

@RestController
@RequestMapping(value = "/Product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/{productName}",method=RequestMethod.GET)
	public ResponseEntity<List<ProductDTO>> getProductsByName(@PathVariable String productName) throws ProductException{
		
		List<ProductDTO> productFromDB = productService.getProductsByName(productName);
		
		return new ResponseEntity<List<ProductDTO>>(productFromDB,HttpStatus.OK);
		
	}
	
}
