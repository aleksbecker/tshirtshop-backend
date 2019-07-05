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
import com.turing.tshirtshop.entity.Department;
import com.turing.tshirtshop.repository.CategoryRepository;
import com.turing.tshirtshop.repository.DepartmentRepository;

@RestController
@CrossOrigin(origins = "*")
public class StripeController {



    @Autowired
    private DepartmentRepository departmentRepository;
    
   
    private static final Logger logger = LoggerFactory.getLogger(StripeController.class);

    
    @GetMapping("/st")
    public List<Department> getdepartments() {
    	return departmentRepository.findAll();
    }
    
    @GetMapping("/st/{id}")
    public Optional<Department> getCategoryById(@PathVariable(value = "id") Long id)  {
    	return departmentRepository.findById(id);
    }
     
    
}
