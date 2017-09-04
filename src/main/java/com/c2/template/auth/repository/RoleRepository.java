package com.c2.template.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.c2.template.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
