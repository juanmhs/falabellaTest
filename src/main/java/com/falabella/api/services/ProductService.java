package com.falabella.api.services;

import com.falabella.api.entities.Product;

public interface ProductService {

	public void save(Product product);
	
	public void delete(Long sku);
}
