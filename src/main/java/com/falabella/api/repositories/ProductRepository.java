package com.falabella.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.falabella.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findBySku(String sku);
}
