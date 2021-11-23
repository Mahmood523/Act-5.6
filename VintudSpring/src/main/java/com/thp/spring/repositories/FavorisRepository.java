package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.entities.Favoris;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Long> {

}
