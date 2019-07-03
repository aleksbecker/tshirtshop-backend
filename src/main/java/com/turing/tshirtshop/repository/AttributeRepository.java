package com.turing.tshirtshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Attribute;
import com.turing.tshirtshop.entity.Department;

/**
 * Created by aleksbecker.
 */
@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {
	
	
}
