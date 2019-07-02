package com.turing.tshirtshop.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.api.entity.Attribute;
import com.turing.tshirtshop.api.entity.Department;

/**
 * Created by aleksbecker.
 */
@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {
	
	
}
