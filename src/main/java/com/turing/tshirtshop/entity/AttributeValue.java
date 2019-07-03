package com.turing.tshirtshop.entity;

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
 * Attribute entity
 */
@Entity
@JsonPropertyOrder({ "attribute_value_id", "value"})
public class AttributeValue implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="attribute_value_id")
	@JsonProperty("attribute_value_id")
	private Long id;
	
	private String value;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "attribute_id")
	private Attribute attribute;

	public AttributeValue() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Attribute getAttribute() {
		return attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	
	@JsonInclude
	public String getAttribute_name() {
		if ( getAttribute()!=null )return getAttribute().getName();
		return null;
	}

}
