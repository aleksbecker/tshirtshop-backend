package com.turing.tshirtshop.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turing.tshirtshop.api.entity.Role;
import com.turing.tshirtshop.api.entity.RoleName;

/**
 * Created by aleksbecker.
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
    
}
