package com.turing.tshirtshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Customer;
import com.turing.tshirtshop.entity.Department;

/**
 * Created by aleksbecker.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	
}
