package com.turing.tshirtshop.api.entity;


import java.math.BigDecimal;
import java.util.Date;

/**
 * Orders entity
 */
public class Orders implements java.io.Serializable {

	private Integer orderId;
	private BigDecimal totalAmount;
	private Date createdOn;
	private Date shippedOn;
	private int status;
	private String comments;
	private Integer customerId;
	private String authCode;
	private String reference;
	private Integer shippingId;
	private Integer taxId;

	public Orders() {
	}

	public Orders(BigDecimal totalAmount, Date createdOn, int status) {
		this.totalAmount = totalAmount;
		this.createdOn = createdOn;
		this.status = status;
	}

	public Orders(BigDecimal totalAmount, Date createdOn, Date shippedOn, int status, String comments,
			Integer customerId, String authCode, String reference, Integer shippingId, Integer taxId) {
		this.totalAmount = totalAmount;
		this.createdOn = createdOn;
		this.shippedOn = shippedOn;
		this.status = status;
		this.comments = comments;
		this.customerId = customerId;
		this.authCode = authCode;
		this.reference = reference;
		this.shippingId = shippingId;
		this.taxId = taxId;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public BigDecimal getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getShippedOn() {
		return this.shippedOn;
	}

	public void setShippedOn(Date shippedOn) {
		this.shippedOn = shippedOn;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getAuthCode() {
		return this.authCode;
	}

	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Integer getShippingId() {
		return this.shippingId;
	}

	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}

	public Integer getTaxId() {
		return this.taxId;
	}

	public void setTaxId(Integer taxId) {
		this.taxId = taxId;
	}

}
