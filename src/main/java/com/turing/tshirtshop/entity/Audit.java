package com.turing.tshirtshop.entity;


import java.util.Date;

/**
 * Audit entity
 */
public class Audit implements java.io.Serializable {

	private Integer auditId;
	private int orderId;
	private Date createdOn;
	private String message;
	private int code;

	public Audit() {
	}

	public Audit(int orderId, Date createdOn, String message, int code) {
		this.orderId = orderId;
		this.createdOn = createdOn;
		this.message = message;
		this.code = code;
	}

	public Integer getAuditId() {
		return this.auditId;
	}

	public void setAuditId(Integer auditId) {
		this.auditId = auditId;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

}
