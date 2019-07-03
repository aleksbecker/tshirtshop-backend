package com.turing.tshirtshop.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.entity.Tax;
import com.turing.tshirtshop.repository.TaxRepository;

@RestController
public class TaxController {



    @Autowired
    private TaxRepository taxRepository;
    
   
    private static final Logger logger = LoggerFactory.getLogger(TaxController.class);

    
    @GetMapping("/tax")
    public List<Tax> getdepartments() {
    	return taxRepository.findAll();
    }
    
    @GetMapping("/tax/{id}")
    public Optional<Tax> getTaxById(@PathVariable(value = "id") Long id)  {
    	return taxRepository.findById(id);
    }
     
    
}
