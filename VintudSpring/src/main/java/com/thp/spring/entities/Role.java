package com.thp.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roleId;
	private String nom;
	private static final long serialVersionUID = 1L;

	public Role() {
		super();
	}

	public Role(String nom) {
		super();
		this.nom = nom;
	}

	public Role(Long roleId, String nom) {
		super();
		this.roleId = roleId;
		this.nom = nom;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
