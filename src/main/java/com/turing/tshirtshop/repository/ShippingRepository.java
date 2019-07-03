package com.turing.tshirtshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Shipping;

/**
 * Created by aleksbecker.
 */
@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {
	
	@Query("SELECT s FROM Shipping s where s.shippingRegion.id=:regionId ") 
	List<Shipping> findShippingsByRegion(Long regionId);
	
}
