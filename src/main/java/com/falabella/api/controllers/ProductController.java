package com.falabella.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.falabella.api.entities.Product;
import com.falabella.api.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping("/create")
	public Product create(@RequestBody Product product) {
		service.save(product);
		
		return product;
	}
	
	@DeleteMapping("/delete/{sku}")
	public String delete(@PathVariable String sku) {
		service.delete(sku);
		
		return "Product Deleted";
	}
}