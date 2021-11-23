package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.entities.Role;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	

}
