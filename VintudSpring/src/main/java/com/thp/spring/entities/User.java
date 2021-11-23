package com.thp.spring.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="`user`")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id ;
	private String firstname ;
	private String name ;
	private String pseudo  ;
	private String mail ;
	private String u_password  ;
	private String phone ;
	private String address  ;
//	private int role_id  ;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="role_id")
	private Role role;
	
	public User() {
		super();
	}
	
	
	
	
public User(String firstname, String name, String pseudo, String mail, String u_password, String phone,
			String address, Role role) {
		super();
		this.firstname = firstname;
		this.name = name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.u_password = u_password;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}




public User(int user_id, String firstname, String name, String pseudo, String mail, String u_password, String phone,
			String address, Role role) {
		super();
		this.user_id = user_id;
		this.firstname = firstname;
		this.name = name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.u_password = u_password;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}


public User(int user_id, String firstname, String name, String pseudo, String mail, String u_password, String phone,
		String address) {
	super();
	this.user_id = user_id;
	this.firstname = firstname;
	this.name = name;
	this.pseudo = pseudo;
	this.mail = mail;
	this.u_password = u_password;
	this.phone = phone;
	this.address = address;
}

public int getUser_id() {
	return user_id;
}

public void setUser_id(int user_id) {
	this.user_id = user_id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPseudo() {
	return pseudo;
}

public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}

public String getMail() {
	return mail;
}

public void setMail(String mail) {
	this.mail = mail;
}

public String getU_password() {
	return u_password;
}

public void setU_password(String u_password) {
	this.u_password = u_password;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
	
	
	

}
