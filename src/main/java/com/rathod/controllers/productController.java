package com.rathod.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rathod.Entity.product;
import com.rathod.service.*;

@RestController
public class productController {

	@Autowired
	private productService productService;
	
	@GetMapping("/hello")
	public String Hello()
	{
		return "connected";
	}

	
	@PostMapping("/addproduct")
	public product addProduct(@RequestBody product product)
	{
		return productService.saveProduct(product);
	}
	
	@PostMapping("/addproducts")
    public List<product> addProducts(@RequestBody List<product> product)
    {
    	return productService.saveProduct(product);
    }
    
    @GetMapping("/product/{productId}")
    public Optional<product> findProductById(@PathVariable Integer productId)
    {
    	return productService.getproductById(productId);
    }
    
    @PutMapping("/update")
    public product updateProduct(product product)
    {
    	return productService.updateProduct(product);
    }
    
    @DeleteMapping("/delete")
    public String DeleteProduct(@PathVariable Integer productId)
    {
    	return productService.deleteProduct(productId);
    }
    
    
	
}
