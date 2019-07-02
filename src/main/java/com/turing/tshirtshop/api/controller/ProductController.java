package com.turing.tshirtshop.api.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.api.entity.Product;
import com.turing.tshirtshop.api.repository.ProductRepository;

@RestController
public class ProductController {


    @Autowired
    private ProductRepository categoryRepository;
    
    @Autowired
    private ProductRepository productRepository;    
    
   
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    
    @GetMapping("/products")
    public List<Product> getProducts() {
    	return productRepository.findAll();
    }
    
    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable(value = "id") Long id)  {
    	return productRepository.findById(id);
    }
     
    @GetMapping("/products/inCategory/{categoryId}")
    public List<Product> getProductByCategory(@PathVariable(value = "categoryId") Long categoryId)  {
    	return productRepository.findByCategory(categoryId);
    }
    
    @GetMapping("/products/inDepartment/{departmentId}")
    public List<Product> getProductByDepartment(@PathVariable(value = "departmentId") Long departmentId)  {
    	return productRepository.findByDepartment(departmentId);
    }
    
}
