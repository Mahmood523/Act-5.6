package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
