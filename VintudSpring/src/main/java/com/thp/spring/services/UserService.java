package com.thp.spring.services;

import java.util.ArrayList;

import com.thp.spring.dtos.UserDto;

public interface UserService {

	public UserDto addUser();

	public UserDto getUserById();

	public UserDto deleteUserById();

	public UserDto updateUserById();

	public ArrayList<UserDto> getAllUsers();

}
