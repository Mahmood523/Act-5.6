package com.thp.spring.dtos;


public class RoleDto {
	
	
	private int roleId ;
	
	private String nom ;

	public RoleDto() {
		super();
	}
	
	

	public RoleDto(String nom) {
		super();
		this.nom = nom;
	}



	public RoleDto(int roleId, String nom) {
		super();
		this.roleId = roleId;
		this.nom = nom;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	

}
