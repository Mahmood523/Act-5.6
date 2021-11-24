package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.entities.Role;


public interface RoleRepository extends JpaRepository<Role, Long> {

}
