package com.turing.tshirtshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Order;

/**
 * Created by aleksbecker.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
}
