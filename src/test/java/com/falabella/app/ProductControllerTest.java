package com.falabella.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatObject;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.falabella.api.controllers.ProductController;
import com.falabella.api.entities.Product;
import com.falabella.api.services.ProductService;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {
	
	@Mock
	private ProductService service;
	
	@InjectMocks
	private ProductController controller;
	
	@Test
	public void createProduct() throws Exception {
		Product requets = new Product();
		requets.setSku(Long.parseLong("8406270"));
		requets.setName("500 Zapatilla Urbana Mujer");
		requets.setBrand("New Balance");
		requets.setSize("37");
		requets.setPrice(42990.00);
		requets.setPrincipalImage("https://falabella.scene7.com/is/image/Falabella/8406270_1");
		
		Product response = controller.create(requets);
		
		assertThatObject(response).isEqualTo(requets);
	}
	
	@Test
	public void deleteProduct() throws Exception {
		String response = controller.delete(Long.parseLong("8406270"));
		assertThat(response).isEqualTo("Product Deleted");
	}
}
