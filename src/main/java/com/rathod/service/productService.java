package com.rathod.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rathod.Entity.product;

@Service
public class productService {
	
	@Autowired
	private com.rathod.repo.productRepository productRepository;
	
	public product saveProduct(product product)
	{
		return productRepository.save(product);
	}
	
	public List<product> saveProduct(List<product> product)
	{
		return productRepository.saveAll(product);
	}

	
	public List<product> getProducts()
	{
		return productRepository.findAll();
	}
	
	public Optional<product> getproductById(Integer productId)
	{
		return productRepository.findById(productId);
	}
	
	public String deleteProduct(Integer productId) {
		productRepository.deleteById(productId);
		return "Product removed";
	}
	
	public product updateProduct(product Product)
	{
		product Existing_product = productRepository.findById(Product.getProductId()).orElse(null);
		
		Existing_product.setProductId(Product.getProductId());
		Existing_product.setProductName(Product.getProductName());
		Existing_product.setProductPrice(Product.getProductPrice());
		Existing_product.setProductQuantity(Product.getProductQuantity());
		
		return productRepository.save(Existing_product);
		
	}
	
	
}
