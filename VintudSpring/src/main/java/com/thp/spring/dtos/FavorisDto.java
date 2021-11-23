package com.thp.spring.dtos;

import java.sql.Date;


import com.thp.spring.entities.Announcement;
import com.thp.spring.entities.User;

public class FavorisDto {
	
	private Date dateAjout;
	
	private int favorisId;
	
    private Announcement announcement;
	
    private User user;
	
	
	public FavorisDto() {
		super();
	}
	
	
	public FavorisDto(Date dateAjout, int favorisId, Announcement announcement, User user) {
		super();
		this.dateAjout = dateAjout;
		this.favorisId = favorisId;
		this.announcement = announcement;
		this.user = user;
	}


	public FavorisDto(Date dateAjout, int favorisId) {
		super();
		this.dateAjout = dateAjout;
		this.favorisId = favorisId;
	}
	public Date getDateAjout() {
		return dateAjout;
	}
	public void setDateAjout(Date dateAjout) {
		this.dateAjout = dateAjout;
	}
	public int getFavorisId() {
		return favorisId;
	}
	public void setFavorisId(int favorisId) {
		this.favorisId = favorisId;
	}


	public Announcement getAnnouncement() {
		return announcement;
	}


	public void setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
