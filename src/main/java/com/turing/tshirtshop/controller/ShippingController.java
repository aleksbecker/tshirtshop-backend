package com.turing.tshirtshop.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.entity.Category;
import com.turing.tshirtshop.entity.Shipping;
import com.turing.tshirtshop.entity.ShippingRegion;
import com.turing.tshirtshop.repository.CategoryRepository;
import com.turing.tshirtshop.repository.ShippingRegionRepository;
import com.turing.tshirtshop.repository.ShippingRepository;

@RestController
@CrossOrigin(origins = "*")
public class ShippingController {



    @Autowired
    private ShippingRepository shippingRepository;
    
    @Autowired
    private ShippingRegionRepository shippingRegionRepository;
    
   
    private static final Logger logger = LoggerFactory.getLogger(ShippingController.class);

    
    @GetMapping("/shipping/regions")
    public List<ShippingRegion> getshippingRegions() {
    	return shippingRegionRepository.findAll();
    }
    
    @GetMapping("/shipping/regions/{id}")
    public List<Shipping> getShippingsByRegion(@PathVariable(value = "id") Long id)  {
    	return shippingRepository.findShippingsByRegion(id);
    }
     
    
}
