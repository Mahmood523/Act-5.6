package com.thp.spring.services;

import java.util.ArrayList;

import com.thp.spring.dtos.RechercheDto;

public interface RechercheService {

	public RechercheDto addRecherche();

	public RechercheDto getRechercheById();

	public RechercheDto deleteRechercheById();

	public RechercheDto updateRechercheById();

	public ArrayList<RechercheDto> getAllRecherches();

}
