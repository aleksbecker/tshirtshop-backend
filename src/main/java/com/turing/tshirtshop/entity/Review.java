package com.turing.tshirtshop.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Review entity
 */
@Entity
public class Review implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="review_id")
	@JsonProperty("review_id")
	private Long id;
	
	
	private String review;
	private short rating;
	private Date createdOn;

	public Review() {
	}

	

	public String getReview() {
		return this.review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public short getRating() {
		return this.rating;
	}

	public void setRating(short rating) {
		this.rating = rating;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

}
