package com.thp.spring.entities;

import java.io.Serializable;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Favoris implements Serializable{
	
	private Date dateAjout;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int favorisId;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "announcementId")
    private Announcement announcement;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
	
	
	public Favoris() {
		super();
	}
	
	
	public Favoris(Date dateAjout, int favorisId, Announcement announcement, User user) {
		super();
		this.dateAjout = dateAjout;
		this.favorisId = favorisId;
		this.announcement = announcement;
		this.user = user;
	}


	public Favoris(Date dateAjout, int favorisId) {
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
	
	
	

}
