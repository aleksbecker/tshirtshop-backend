package com.turing.tshirtshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Shipping;
import com.turing.tshirtshop.entity.ShippingRegion;

/**
 * Created by aleksbecker.
 */
@Repository
public interface ShippingRegionRepository extends JpaRepository<ShippingRegion, Long> {
	
	
}
