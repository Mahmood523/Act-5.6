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
public class Favoris implements Serializable {

	private Date dateAjout;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long favorisId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "announcementId")
	private Announcement announcement;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;
	private static final long serialVersionUID = 1L;

	public Favoris() {
		super();
	}

	public Favoris(Date dateAjout, Long favorisId, Announcement announcement, User user) {
		super();
		this.dateAjout = dateAjout;
		this.favorisId = favorisId;
		this.announcement = announcement;
		this.user = user;
	}

	public Favoris(Date dateAjout, Long favorisId) {
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

	public Long getFavorisId() {
		return favorisId;
	}

	public void setFavorisId(Long favorisId) {
		this.favorisId = favorisId;
	}

}
