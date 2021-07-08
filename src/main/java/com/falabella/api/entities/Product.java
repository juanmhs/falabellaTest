package com.falabella.api.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull(message = "SKU required")
	@Min(value = 1000000, message = "SKU debe ser mayor a 1000000")
	@Max(value = 99999999, message = "SKU debe ser menor a 99999999")
	@Column(name = "sku", unique = true)
	private Long sku;

	@NotEmpty(message = "Name required")
	@Size(min = 3, max = 50, message = "el tamaño del name debe estar entre 3 y 50")
	@Column(name = "name")
	private String name;

	@NotEmpty(message = "Brand required")
	@Size(min = 3, max = 50, message = "el tamaño del name debe estar entre 3 y 50")
	@Column(name = "brand")
	private String brand;

	@Column(name = "size")
	private String size;

	@NotNull(message = "Price required")
	@Min(value = 1, message = "SKU debe ser mayor a 1000000")
	@Max(value = 99999999, message = "SKU debe ser menor a 99999999")
	@Column(name = "price")
	private double price;

	@NotEmpty(message = "principalImage required")
	@Column(name = "principal_image")
	private String principalImage;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "product", targetEntity = ProductImages.class)
	private List<ProductImages> otherImages;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSku() {
		return sku;
	}

	public void setSku(Long sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPrincipalImage() {
		return principalImage;
	}

	public void setPrincipalImage(String principalImage) {
		this.principalImage = principalImage;
	}

	public List<ProductImages> getOtherImages() {
		return otherImages;
	}

	public void setOtherImages(List<ProductImages> otherImages) {
		this.otherImages = otherImages;
	}
}
