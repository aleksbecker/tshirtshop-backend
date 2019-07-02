package com.turing.tshirtshop.api.repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.api.entity.Role;
import com.turing.tshirtshop.api.entity.RoleName;
import com.turing.tshirtshop.api.entity.User;

/**
 * Created by aleksbecker.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    //List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
    
    User findByEmail(String email);
	
	User findOneById(String id);
	
	User findOneById(Long id);
	
	//@Query("SELECT u FROM User u where u.role ") 
	Set<User> findByRoles(Role role);
	
	Set<User> findByIdIn(List<String> ids);
}
