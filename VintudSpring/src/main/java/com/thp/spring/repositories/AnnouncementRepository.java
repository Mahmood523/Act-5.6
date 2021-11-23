package com.thp.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.entities.Announcement;


@Repository
public interface AnnouncementRepository extends JpaRepository <Announcement,Long>{
	

}
