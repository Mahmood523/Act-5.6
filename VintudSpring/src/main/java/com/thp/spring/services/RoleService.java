package com.thp.spring.services;

import java.util.List;

import com.thp.spring.dtos.RoleDto;

public interface RoleService {

	public RoleDto addRole(RoleDto roleDto);

	public RoleDto getRoleById(Long id);

	public RoleDto deleteRoleById(Long id);

	public RoleDto updateRoleById(RoleDto roleDto);

	public List<RoleDto> getAllRoles();

}
