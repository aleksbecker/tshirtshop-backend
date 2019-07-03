package com.turing.tshirtshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Review;

/**
 * Created by aleksbecker.
 */
@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	

	@Query("SELECT r FROM Review r where r.product.id=:productId ") 
	List<Review> findReviews(Long productId);
	
}
