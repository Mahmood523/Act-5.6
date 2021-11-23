package com.thp.spring.dtos;



import com.thp.spring.entities.User;

public class RechercheDto {
	
	
	private int rechercheId;
	private String couleur;
	private String taille;
	private String type_habit;
	private float prix;

    private User user;
	
	
	public RechercheDto() {
		super();
	}
	
	
public RechercheDto(int rechercheId, String couleur, String taille, String type_habit, float prix, User user) {
		super();
		this.rechercheId = rechercheId;
		this.couleur = couleur;
		this.taille = taille;
		this.type_habit = type_habit;
		this.prix = prix;
		this.user = user;
	}


public RechercheDto(int rechercheId, String couleur, String taille, String type_habit, float prix) {
	super();
	this.rechercheId = rechercheId;
	this.couleur = couleur;
	this.taille = taille;
	this.type_habit = type_habit;
	this.prix = prix;
}
public int getRechercheId() {
	return rechercheId;
}
public void setRechercheId(int rechercheId) {
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
