package com.thp.spring.dtos;

import java.sql.Date;

import com.thp.spring.entities.Category;
import com.thp.spring.entities.User;

public class AnnouncementDto {

	private int announcementId;

	private String title;
	private String description;

	private Category category;

	private double price;
	private byte[] picture;
	private Date publication_date;
	private boolean is_available;
	private int view_number;
	private String localisation;
	private User user;

	public AnnouncementDto() {
		super();
	}

	public AnnouncementDto(int announcementId, String title, String description, Category category, double price,
			byte[] picture, Date publication_date, boolean is_available, int view_number, String localisation,
			User user) {
		super();
		this.announcementId = announcementId;
		this.title = title;
		this.description = description;
		this.category = category;
		this.price = price;
		this.picture = picture;
		this.publication_date = publication_date;
		this.is_available = is_available;
		this.view_number = view_number;
		this.localisation = localisation;
		this.user = user;
	}

	public AnnouncementDto(int announcementId, String title, String description, double price, byte[] picture,
			Date publication_date, boolean is_available, int view_number, String localisation) {
		super();
		this.announcementId = announcementId;
		this.title = title;
		this.description = description;
		this.price = price;
		this.picture = picture;
		this.publication_date = publication_date;
		this.is_available = is_available;
		this.view_number = view_number;
		this.localisation = localisation;
	}

	public int getAnnouncementId() {
		return announcementId;
	}

	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public boolean isIs_available() {
		return is_available;
	}

	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}

	public int getView_number() {
		return view_number;
	}

	public void setView_number(int view_number) {
		this.view_number = view_number;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
