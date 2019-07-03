package com.turing.tshirtshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.entity.Attribute;
import com.turing.tshirtshop.entity.AttributeValue;
import com.turing.tshirtshop.entity.Category;
import com.turing.tshirtshop.entity.Product;

/**
 * Created by aleksbecker.
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("SELECT p.categories FROM Product p where p.id=:productId ") 
	List<Category> findCategories(Long productId);
	
	@Query("SELECT p.attributes FROM Product p where p.id=:productId ") 
	List<AttributeValue> findAttributes(Long productId);
	
	@Query("SELECT p FROM Product p join p.categories c join c.department d where d.id=:departmentId ") 
	List<Product> findByDepartment(Long departmentId);
	
	@Query("SELECT p FROM Product p join p.categories c where c.id=:categoryId ") 
	List<Product> findByCategory(Long categoryId);
}
