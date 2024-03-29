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
import com.turing.tshirtshop.repository.CategoryRepository;
import com.turing.tshirtshop.repository.ProductRepository;

@RestController
@CrossOrigin(origins = "*")
public class CategoryController {


    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private ProductRepository productRepository;    
    
   
    private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);

    
    @GetMapping("/categories")
    public List<Category> getCategories() {
    	return categoryRepository.findAll();
    }
    
    @GetMapping("/categories/{id}")
    public Optional<Category> getCategoryById(@PathVariable(value = "id") Long id)  {
    	return categoryRepository.findById(id);
    }
     
    @GetMapping("/categories/inProduct/{productId}")
    public List<Category> getCategoryByProduct(@PathVariable(value = "productId") Long productId)  {
    	return productRepository.findCategories(productId);
    }
    
    @GetMapping("/categories/inDepartment/{departmentId}")
    public List<Category> getCategoryByDepartment(@PathVariable(value = "departmentId") Long departmentId)  {
    	return categoryRepository.findByDepartment(departmentId);
    }
    
}
