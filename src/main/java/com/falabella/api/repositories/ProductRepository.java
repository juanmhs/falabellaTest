package com.falabella.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.falabella.api.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("SELECT p FROM Product p WHERE p.sku = ?1")
	Product findBySku(String sku);
}
