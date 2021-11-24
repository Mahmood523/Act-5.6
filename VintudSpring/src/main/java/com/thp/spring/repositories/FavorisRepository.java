package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.entities.Favoris;


public interface FavorisRepository extends JpaRepository<Favoris, Long> {

}
