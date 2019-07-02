package com.turing.tshirtshop.api.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.api.entity.Attribute;
import com.turing.tshirtshop.api.entity.AttributeValue;
import com.turing.tshirtshop.api.repository.AttributeRepository;
import com.turing.tshirtshop.api.repository.AttributeValueRepository;
import com.turing.tshirtshop.api.repository.ProductRepository;

@RestController
public class AttributeController {


    @Autowired
    private AttributeRepository attributeRepository;
    
    @Autowired
    private ProductRepository productRepository;    
    
    @Autowired
    private AttributeValueRepository attributeValueRepository;
    
   
    private static final Logger logger = LoggerFactory.getLogger(AttributeController.class);

    
    @GetMapping("/attributes")
    public List<Attribute> getattributes() {
    	return attributeRepository.findAll();
    }
    
    @GetMapping("/attributes/{id}")
    public Optional<Attribute> getAttributeById(@PathVariable(value = "id") Long id)  {
    	return attributeRepository.findById(id);
    }
     
    
    @GetMapping("/attributes/values/{attributeId}")
    public List<AttributeValue> getAttributeValues(@PathVariable(value = "attributeId") Long attributeId)  {
    	return attributeValueRepository.findByAttribute(attributeId);
    }
    
    @GetMapping("/attributes/inProduct/{productId}")
    public List<AttributeValue> getAttributeByProduct(@PathVariable(value = "productId") Long productId)  {
    	return productRepository.findAttributes(productId);
    }
    
}
