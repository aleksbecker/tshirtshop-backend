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
 * Category entity
 */
@Entity
@JsonPropertyOrder({ "category_id", "name", "description", "department_id"})
public class Category implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="category_id")
	@JsonProperty("category_id")
	private Long id;
	
	private String name;
	private String description;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public Category() {
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


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}

	@JsonInclude
	public Long getDepartment_id() {
		if ( getDepartment()!=null )return getDepartment().getId();
		return null;
	}
	
	@JsonInclude
	public String getDepartment_name() {
		if ( getDepartment()!=null )return getDepartment().getDescription();
		return null;
	}
}
