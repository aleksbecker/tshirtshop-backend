package com.turing.tshirtshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Tax;

/**
 * Created by aleksbecker.
 */
@Repository
public interface TaxRepository extends JpaRepository<Tax, Long> {
	
	
}
