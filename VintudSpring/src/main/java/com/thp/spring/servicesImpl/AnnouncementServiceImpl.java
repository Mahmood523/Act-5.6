package com.thp.spring.servicesImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.dtos.AnnouncementDto;
import com.thp.spring.repositories.AnnouncementRepository;
import com.thp.spring.services.AnnouncementService;

@Service
@Transactional
public class AnnouncementServiceImpl implements AnnouncementService {

	@Autowired
	AnnouncementRepository announcementRepository;

	@Override
	public ArrayList<AnnouncementDto> findAnnouncementByNameCatgeryAndOrPrice() {

		return null;
	}

	@Override
	public ArrayList<AnnouncementDto> filtreAnnoucementPrix() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AnnouncementDto> filtreAnnoucementLocalisation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int voirNombreVues() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<AnnouncementDto> findAnnouncesByIdUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AnnouncementDto> findAllAnnoucements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnnouncementDto addAnnouncement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnnouncementDto getAnnouncementById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnnouncementDto deleteAnnouncementById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AnnouncementDto updateAnnouncementById() {
		// TODO Auto-generated method stub
		return null;
	}

}
