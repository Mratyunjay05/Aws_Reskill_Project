package com.infy.ekart.product.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.infy.ekart.product.dto.ProductDTO;
import com.infy.ekart.product.entity.Product;
import com.infy.ekart.product.exception.ProductException;
import com.infy.ekart.product.repository.ProductRepository;


@Service(value = "productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	Environment env;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductDTO getProductsByName(String productName) throws ProductException{
		
		Product productFromDB = productRepository.findByProductName(productName);
		
		if(productFromDB==null) {
			//env.getProperty("Service.Product_Absent");
		throw new ProductException("Service.Product_Absent");
		}
		
		ProductDTO productDTOList = new ProductDTO();
		
			ProductDTO dto = new ProductDTO();
			dto.setProdId(productFromDB.getProdId());
			dto.setProductName(productFromDB.getProductName());
			dto.setPrice(productFromDB.getPrice());
			dto.setStock(productFromDB.getStock());
			dto.setDescription(productFromDB.getDescription());
			dto.setSellerId(productFromDB.getSellerId());
			dto.setCategory(productFromDB.getCategory());
			dto.setSubCategory(productFromDB.getSubCategory());
			dto.setProductRating(productFromDB.getProductRating());
			
			
		

		
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

	@Override
	public ProductDTO getProductById(Integer prodId) throws ProductException {
		Product pd = productRepository.findByProdId(prodId);
		
		if(pd==null) {
			//env.getProperty("Service.Product_Absent");
		throw new ProductException("Service.Product_Absent");
		}
		
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
			
		

		
		return dto;
	}
	
	@Override
	public String addProducts(ProductDTO productDTO) throws ProductException{
		
		Product productEntity = new Product();
		productEntity.setProdId(productDTO.getProdId());
		productEntity.setProductName(productDTO.getProductName());
		productEntity.setPrice(productDTO.getPrice());
		productEntity.setStock(productDTO.getStock());
		productEntity.setDescription(productDTO.getDescription());
		productEntity.setSellerId(productDTO.getSellerId());
		productEntity.setCategory(productDTO.getCategory());
		productEntity.setSubCategory(productDTO.getSubCategory());
		productEntity.setProductRating(productDTO.getProductRating());
		
		productRepository.save(productEntity);
		
		return productEntity.getProductName();
		
	}
	
//	@Override
//	public String deleteProducts(String productName) throws ProductException{
//		
//		Product product = productRepository.findByProductName(productName);
//		
//	}
	
}
