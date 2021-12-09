package com.thp.spring.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.dtos.CategoryDto;
import com.thp.spring.dtos.RoleDto;
import com.thp.spring.services.RoleService;

@RestController
@RequestMapping("/gestionnaireRoles")
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@GetMapping(value = "/listeRoles")
	public List<RoleDto> getAllRoles() {
		return roleService.getAllRoles();

	}
	
	@PostMapping(value = "/addRole")
	public RoleDto aadCategory(@RequestBody RoleDto roleDto) {
		return roleService.addRole(roleDto);

	}
	
	@DeleteMapping(value = "/deleteRole/{id}")
	public RoleDto deleteCategory(@PathVariable Long id) {
		return roleService.deleteRoleById(id);

	}
	
	@GetMapping(value = "/findRole/{id}")
	public RoleDto getRoleById(@PathVariable Long id) {
		return roleService.getRoleById(id);

	}
	
	@PutMapping(value = "/updateRole/{id}")
	public RoleDto updateRoleById(@RequestBody RoleDto roleDto) {
		return roleService.updateRoleById(roleDto);

	}

}
