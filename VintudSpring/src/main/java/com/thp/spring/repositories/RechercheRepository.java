package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.entities.Recherche;


@Repository
public interface RechercheRepository extends JpaRepository<Recherche, Long>{
	

}
