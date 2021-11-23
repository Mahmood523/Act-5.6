package com.thp.spring.dtos;

import com.thp.spring.entities.Role;

public class UserDto {

	private int userId;
	private String firstname;
	private String name;
	private String pseudo;
	private String mail;
	private String userPassword;
	private String phone;
	private String address;

	private Role role;

	public UserDto() {
		super();
	}

	public UserDto(String firstname, String name, String pseudo, String mail, String userPassword, String phone,
			String address, Role role) {
		super();
		this.firstname = firstname;
		this.name = name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.userPassword = userPassword;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}

	public UserDto(int userId, String firstname, String name, String pseudo, String mail, String userPpassword,
			String phone, String address, Role role) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.name = name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.userPassword = userPassword;
		this.phone = phone;
		this.address = address;
		this.role = role;
	}

	public UserDto(int userId, String firstname, String name, String pseudo, String mail, String userPassword,
			String phone, String address) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.name = name;
		this.pseudo = pseudo;
		this.mail = mail;
		this.userPassword = userPassword;
		this.phone = phone;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
