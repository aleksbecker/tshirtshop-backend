package com.turing.tshirtshop.entity;


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Product entity
 */
@Entity
@JsonPropertyOrder({ "product_id", "name", "description", "price", "discounted_price", "image", "image_2", "thumbnail", "display" })
public class Product implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	@JsonProperty("product_id")
	private Long id;
	
	private String name;
	private String description;
	private BigDecimal price;
	@JsonProperty("discounted_price")
	private BigDecimal discountedPrice;
	private String image;
	@Column(name="image_2")
	@JsonProperty("image_2")
	private String image2;
	private String thumbnail;
	private short display;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<Category> categories = new HashSet<>();
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_attribute",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_value_id"))
    private Set<AttributeValue> attributes = new HashSet<>();

	public Product() {
	}

	public Product(String name, String description, BigDecimal price, BigDecimal discountedPrice, short display) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.display = display;
	}

	public Product(String name, String description, BigDecimal price, BigDecimal discountedPrice, String image,
			String image2, String thumbnail, short display) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.image = image;
		this.image2 = image2;
		this.thumbnail = thumbnail;
		this.display = display;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getDiscountedPrice() {
		return this.discountedPrice;
	}

	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage2() {
		return this.image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public short getDisplay() {
		return this.display;
	}

	public void setDisplay(short display) {
		this.display = display;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}

	public Set<AttributeValue> getAttributes() {
		return attributes;
	}

	public void setAttributes(Set<AttributeValue> attributes) {
		this.attributes = attributes;
	}

}
