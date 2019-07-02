package com.turing.tshirtshop.api.entity;


import java.util.Date;

/**
 * ShoppingCart entity
 */
public class ShoppingCart implements java.io.Serializable {

	private Integer itemId;
	private String cartId;
	private int productId;
	private String attributes;
	private int quantity;
	private boolean buyNow;
	private Date addedOn;

	public ShoppingCart() {
	}

	public ShoppingCart(String cartId, int productId, String attributes, int quantity, boolean buyNow, Date addedOn) {
		this.cartId = cartId;
		this.productId = productId;
		this.attributes = attributes;
		this.quantity = quantity;
		this.buyNow = buyNow;
		this.addedOn = addedOn;
	}

	public Integer getItemId() {
		return this.itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getCartId() {
		return this.cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
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

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isBuyNow() {
		return this.buyNow;
	}

	public void setBuyNow(boolean buyNow) {
		this.buyNow = buyNow;
	}

	public Date getAddedOn() {
		return this.addedOn;
	}

	public void setAddedOn(Date addedOn) {
		this.addedOn = addedOn;
	}

}
