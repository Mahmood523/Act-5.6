package com.thp.spring.services;
import java.util.ArrayList;


import com.thp.spring.dtos.AnnouncementDto;

public interface AnnouncementService {
	
	
	public ArrayList<AnnouncementDto> findAnnouncementByNameCatgeryAndOrPrice () ;		
	public ArrayList<AnnouncementDto> filtreAnnoucementPrix () ;
	public ArrayList<AnnouncementDto> filtreAnnoucementLocalisation () ;
	public int voirNombreVues () ;
	
	public ArrayList<AnnouncementDto> findAnnouncesByIdUser();	
	public ArrayList<AnnouncementDto> findAllAnnoucements();
	
	public AnnouncementDto addAnnouncement () ;
	public AnnouncementDto getAnnouncementById() ;
	public AnnouncementDto deleteAnnouncementById () ;
	public AnnouncementDto updateAnnouncementById() ;	
	
	
	

}
