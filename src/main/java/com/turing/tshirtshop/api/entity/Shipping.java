package com.turing.tshirtshop.api.entity;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Shipping entity
 */
@Entity
public class Shipping implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shipping_id")
	private Long id;
	private String shippingType;
	private BigDecimal shippingCost;
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


}
