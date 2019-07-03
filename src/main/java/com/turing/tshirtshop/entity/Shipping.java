package com.turing.tshirtshop.entity;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Shipping entity
 */
@Entity
@JsonPropertyOrder({ "shipping_id", "shipping_type", "shipping_cost", "Shipping_region_id"})
public class Shipping implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shipping_id")
	@JsonProperty("shipping_id")
	private Long id;
	@JsonProperty("shipping_type")
	private String shippingType;
	@JsonProperty("shipping_cost")
	private BigDecimal shippingCost;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "Shipping_region_id")
	private ShippingRegion shippingRegion;

	public Shipping() {
	}

	public String getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(String shippingType) {
		this.shippingType = shippingType;
	}

	public BigDecimal getShippingCost() {
		return this.shippingCost;
	}

	public void setShippingCost(BigDecimal shippingCost) {
		this.shippingCost = shippingCost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ShippingRegion getShippingRegion() {
		return shippingRegion;
	}

	public void setShippingRegion(ShippingRegion shippingRegion) {
		this.shippingRegion = shippingRegion;
	}
	
	
	
	@JsonInclude
	public Long getShipping_region_id() {
		if ( getShippingRegion()!=null )return getShippingRegion().getId();
		return null;
	}


}
