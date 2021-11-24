package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thp.spring.entities.Announcement;


public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {

}
