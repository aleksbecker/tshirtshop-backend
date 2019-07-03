package com.turing.tshirtshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Attribute;
import com.turing.tshirtshop.entity.AttributeValue;

/**
 * Created by aleksbecker.
 */
@Repository
public interface AttributeValueRepository extends JpaRepository<Attribute, Long> {
	
	@Query("SELECT a FROM AttributeValue a where a.attribute.id=:attributeId ") 
	List<AttributeValue> findByAttribute(Long attributeId);
}
