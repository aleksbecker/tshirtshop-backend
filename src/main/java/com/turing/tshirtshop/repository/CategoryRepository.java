package com.turing.tshirtshop.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Category;
import com.turing.tshirtshop.entity.Role;
import com.turing.tshirtshop.entity.RoleName;
import com.turing.tshirtshop.entity.User;

/**
 * Created by aleksbecker.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	List<Category> findAll();
	
	
	@Query("SELECT c FROM Category c where c.department.id=:departmentId ") 
	List<Category> findByDepartment(Long departmentId);
	
}
