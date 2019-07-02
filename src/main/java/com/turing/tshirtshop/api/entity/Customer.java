package com.turing.tshirtshop.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Customer entity
 */
@Entity
public class Customer implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Long id;
	private String name;
	private String email;
	private String password;
	private String creditCard;
	private String address1;
	private String address2;
	private String city;
	private String region;
	private String postalCode;
	private String country;
	private int shippingRegionId;
	private String dayPhone;
	private String evePhone;
	private String mobPhone;

	public Customer() {
	}

	public Customer(String name, String email, String password, int shippingRegionId) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.shippingRegionId = shippingRegionId;
	}

	public Customer(String name, String email, String password, String creditCard, String address1, String address2,
			String city, String region, String postalCode, String country, int shippingRegionId, String dayPhone,
			String evePhone, String mobPhone) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.creditCard = creditCard;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
		this.country = country;
		this.shippingRegionId = shippingRegionId;
		this.dayPhone = dayPhone;
		this.evePhone = evePhone;
		this.mobPhone = mobPhone;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreditCard() {
		return this.creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getShippingRegionId() {
		return this.shippingRegionId;
	}

	public void setShippingRegionId(int shippingRegionId) {
		this.shippingRegionId = shippingRegionId;
	}

	public String getDayPhone() {
		return this.dayPhone;
	}

	public void setDayPhone(String dayPhone) {
		this.dayPhone = dayPhone;
	}

	public String getEvePhone() {
		return this.evePhone;
	}

	public void setEvePhone(String evePhone) {
		this.evePhone = evePhone;
	}

	public String getMobPhone() {
		return this.mobPhone;
	}

	public void setMobPhone(String mobPhone) {
		this.mobPhone = mobPhone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
