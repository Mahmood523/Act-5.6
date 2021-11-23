package com.thp.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Recherche implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rechercheId;
	private String couleur;
	private String taille;
	private String type_habit;
	private float prix;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;
	private static final long serialVersionUID = 1L;

	public Recherche() {
		super();
	}

	public Recherche(Long rechercheId, String couleur, String taille, String type_habit, float prix, User user) {
		super();
		this.rechercheId = rechercheId;
		this.couleur = couleur;
		this.taille = taille;
		this.type_habit = type_habit;
		this.prix = prix;
		this.user = user;
	}

	public Recherche(Long rechercheId, String couleur, String taille, String type_habit, float prix) {
		super();
		this.rechercheId = rechercheId;
		this.couleur = couleur;
		this.taille = taille;
		this.type_habit = type_habit;
		this.prix = prix;
	}

	public Long getRechercheId() {
		return rechercheId;
	}

	public void setRecherche_id(Long rechercheId) {
		this.rechercheId = rechercheId;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	public String getType_habit() {
		return type_habit;
	}

	public void setType_habit(String type_habit) {
		this.type_habit = type_habit;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

}
