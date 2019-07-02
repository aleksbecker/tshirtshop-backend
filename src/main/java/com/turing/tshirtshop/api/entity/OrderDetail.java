package com.turing.tshirtshop.api.entity;


import java.math.BigDecimal;

/**
 * OrderDetail entity
 */
public class OrderDetail implements java.io.Serializable {

	private Integer itemId;
	private int orderId;
	private int productId;
	private String attributes;
	private String productName;
	private int quantity;
	private BigDecimal unitCost;

	public OrderDetail() {
	}

	public OrderDetail(int orderId, int productId, String attributes, String productName, int quantity,
			BigDecimal unitCost) {
		this.orderId = orderId;
		this.productId = productId;
		this.attributes = attributes;
		this.productName = productName;
		this.quantity = quantity;
		this.unitCost = unitCost;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitCost() {
		return this.unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
	}

}
