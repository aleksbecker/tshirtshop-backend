package com.turing.tshirtshop.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.entity.AttributeValue;
import com.turing.tshirtshop.entity.Category;
import com.turing.tshirtshop.entity.Product;
import com.turing.tshirtshop.entity.Review;
import com.turing.tshirtshop.repository.ProductRepository;
import com.turing.tshirtshop.repository.ReviewRepository;

@RestController
public class ProductController {


    @Autowired
    private ProductRepository categoryRepository;
    
    @Autowired
    private ProductRepository productRepository;    
    
    @Autowired
    private ReviewRepository reviewRepository;    
    
    
   
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    
    @GetMapping("/products")
    public List<Product> getProducts() {
    	return productRepository.findAll();
    }
    
    @GetMapping("/search") //TODO
    public List<Product> search() {
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
    
    @GetMapping("/products/{productId}/details")
    public List<AttributeValue> details(@PathVariable(value = "productId") Long productId) {
    	return productRepository.findAttributes(productId);
    }
    
    @GetMapping("/products/{productId}/locations")
    public List<Category> locations(@PathVariable(value = "productId") Long productId) {
    	return productRepository.findCategories(productId);
    }
    
    @GetMapping("/products/{productId}/reviews")
    public List<Review> reviews(@PathVariable(value = "productId") Long productId) {
    	return reviewRepository.findReviews(productId);
    }
    
    @PostMapping("/products/{productId}/reviews") //TODO
    public void postReviews(@PathVariable(value = "productId") Long productId) {
    	
    }
    
}
