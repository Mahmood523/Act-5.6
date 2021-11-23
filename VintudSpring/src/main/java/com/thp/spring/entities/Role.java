package com.thp.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int role_id ;
	
	private String nom ;

	public Role() {
		super();
	}
	
	

	public Role(String nom) {
		super();
		this.nom = nom;
	}



	public Role(int role_id, String nom) {
		super();
		this.role_id = role_id;
		this.nom = nom;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
