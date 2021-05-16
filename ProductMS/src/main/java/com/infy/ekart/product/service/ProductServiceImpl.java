package com.infy.ekart.product.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.ekart.product.dto.ProductDTO;
import com.infy.ekart.product.entity.Product;
import com.infy.ekart.product.exception.ProductException;
import com.infy.ekart.product.repository.ProductRepository;


@Service(value = "productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<ProductDTO> getProductsByName(String productName) throws ProductException{
		
		List<Product> productFromDB = productRepository.findByProductName(productName);
		
		if(productFromDB.isEmpty()) {
			throw new ProductException("No product of this name present");
		}
		
		List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		for(Product pd : productFromDB) {
			ProductDTO dto = new ProductDTO();
			dto.setProdId(pd.getProdId());
			dto.setProductName(pd.getProductName());
			dto.setPrice(pd.getPrice());
			dto.setStock(pd.getStock());
			dto.setDescription(pd.getDescription());
			dto.setSellerId(pd.getSellerId());
			dto.setCategory(pd.getCategory());
			dto.setSubCategory(pd.getSubCategory());
			dto.setProductRating(pd.getProductRating());
			
			productDTOList.add(dto);
		}
		

		
		return productDTOList;
	}

	@Override
	public List<ProductDTO> getProductsByCategory(String category) throws ProductException {

		List<Product> productFromDB = productRepository.findByCategory(category);
		
		if(productFromDB.isEmpty()) {
			throw new ProductException("No product of this name present");
		}
		
		List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		for(Product pd : productFromDB) {
			ProductDTO dto = new ProductDTO();
			dto.setProdId(pd.getProdId());
			dto.setProductName(pd.getProductName());
			dto.setPrice(pd.getPrice());
			dto.setStock(pd.getStock());
			dto.setDescription(pd.getDescription());
			dto.setSellerId(pd.getSellerId());
			dto.setCategory(pd.getCategory());
			dto.setSubCategory(pd.getSubCategory());
			dto.setProductRating(pd.getProductRating());
			
			productDTOList.add(dto);
		}
		

		
		return productDTOList;
	}

	@Override
	public List<ProductDTO> getAllProducts() throws ProductException {
		
List<Product> productFromDB = (List<Product>) productRepository.findAll();
		
		if(productFromDB.isEmpty()) {
			throw new ProductException("No product of this name present");
		}
		
		List<ProductDTO> productDTOList = new ArrayList<ProductDTO>();
		for(Product pd : productFromDB) {
			ProductDTO dto = new ProductDTO();
			dto.setProdId(pd.getProdId());
			dto.setProductName(pd.getProductName());
			dto.setPrice(pd.getPrice());
			dto.setStock(pd.getStock());
			dto.setDescription(pd.getDescription());
			dto.setSellerId(pd.getSellerId());
			dto.setCategory(pd.getCategory());
			dto.setSubCategory(pd.getSubCategory());
			dto.setProductRating(pd.getProductRating());
			
			productDTOList.add(dto);
		}
		

		
		return productDTOList;
	}
	
}
