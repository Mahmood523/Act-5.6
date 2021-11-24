package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
