package com.turing.tshirtshop.api.entity;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Tax entity
 */
@Entity
public class Tax implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tax_id")
	private Long id;
	private String taxType;
	private BigDecimal taxPercentage;

	public Tax() {
	}

	public Tax(String taxType, BigDecimal taxPercentage) {
		this.taxType = taxType;
		this.taxPercentage = taxPercentage;
	}


	public String getTaxType() {
		return this.taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public BigDecimal getTaxPercentage() {
		return this.taxPercentage;
	}

	public void setTaxPercentage(BigDecimal taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
