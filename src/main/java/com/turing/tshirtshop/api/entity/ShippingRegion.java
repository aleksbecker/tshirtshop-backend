package com.turing.tshirtshop.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * ShippingRegion entity
 */
@Entity
public class ShippingRegion implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="shipping_region_id")
	private Long id;
	private String shippingRegion;

	public ShippingRegion() {
	}

	public ShippingRegion(String shippingRegion) {
		this.shippingRegion = shippingRegion;
	}


	public String getShippingRegion() {
		return this.shippingRegion;
	}

	public void setShippingRegion(String shippingRegion) {
		this.shippingRegion = shippingRegion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
