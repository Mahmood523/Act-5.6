package com.thp.spring.services;

import java.util.ArrayList;

import com.thp.spring.dtos.RoleDto;

public interface RoleService {

	public RoleDto addRole();

	public RoleDto getRoleById();

	public RoleDto deleteRoleById();

	public RoleDto updateRoleById();

	public ArrayList<RoleDto> getAllRoles();

}
