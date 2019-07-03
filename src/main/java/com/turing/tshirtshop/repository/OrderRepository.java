package com.turing.tshirtshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Department;

/**
 * Created by aleksbecker.
 */
@Repository
public interface OrderRepository extends JpaRepository<Department, Long> {
	
	
}
