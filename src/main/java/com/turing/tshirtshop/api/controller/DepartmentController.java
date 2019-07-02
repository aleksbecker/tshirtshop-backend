package com.turing.tshirtshop.api.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.api.entity.Category;
import com.turing.tshirtshop.api.entity.Department;
import com.turing.tshirtshop.api.repository.CategoryRepository;
import com.turing.tshirtshop.api.repository.DepartmentRepository;

@RestController
public class DepartmentController {



    @Autowired
    private DepartmentRepository departmentRepository;
    
   
    private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    
    @GetMapping("/departments")
    public List<Department> getdepartments() {
    	return departmentRepository.findAll();
    }
    
    @GetMapping("/departments/{id}")
    public Optional<Department> getCategoryById(@PathVariable(value = "id") Long id)  {
    	return departmentRepository.findById(id);
    }
     
    
}
