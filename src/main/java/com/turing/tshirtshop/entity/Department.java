package com.turing.tshirtshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Department entity
 */
@Entity
@JsonPropertyOrder({ "department_id", "name", "description"})
public class Department implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="department_id")
	@JsonProperty("department_id")
	private Long id;
	private String name;
	private String description;

	public Department() {
	}

	public Department(String name) {
		this.name = name;
	}

	public Department(String name, String description) {
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
