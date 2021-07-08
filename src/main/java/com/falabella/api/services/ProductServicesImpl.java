package com.falabella.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.falabella.api.entities.Product;
import com.falabella.api.repositories.ProductRepository;

@Service
public class ProductServicesImpl implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public void save(Product product) {
		repository.save(product);
	}

	@Override
	public void delete(Long sku) {
		Product product = repository.findBySku(sku);

		if(product != null) {
			repository.delete(product);
		}

	}

}
