package com.thp.spring.services;

import java.util.ArrayList;

import com.thp.spring.dtos.FavorisDto;

public interface FavorisService {

	public FavorisDto addFavoris();

	public FavorisDto getFavorisById();

	public FavorisDto deleteFavorisById();

	public FavorisDto updateFavorisById();

	public ArrayList<FavorisDto> getAllFavoris();

}
