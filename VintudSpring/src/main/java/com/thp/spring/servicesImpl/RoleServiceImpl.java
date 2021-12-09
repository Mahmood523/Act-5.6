package com.thp.spring.servicesImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thp.spring.dtos.RoleDto;
import com.thp.spring.entities.Role;
import com.thp.spring.repositories.RoleRepository;
import com.thp.spring.services.RoleService;
@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;
	
	private ModelMapper modelMapper = new ModelMapper();
	
	@Override
	public RoleDto addRole(RoleDto roleDto) {
		RoleDto roleDtoToAdd = modelMapper.map(roleRepository.save (modelMapper.map(roleDto , Role.class)), RoleDto.class);

		return roleDtoToAdd;
	}

	@Override
	public RoleDto getRoleById(Long id) {
		Optional<Role> roleRendred = roleRepository.findById(id);
		if (roleRendred.isPresent()) {
			return modelMapper.map(roleRendred.get(), RoleDto.class);}
		return null;
	}

	@Override
	public RoleDto deleteRoleById(Long id) {
		RoleDto roleDtoToDelete = this.getRoleById(id);
		roleRepository.deleteById(id);

		return roleDtoToDelete;
	}

	@Override
	public RoleDto updateRoleById(RoleDto roleDto) {

		return addRole(roleDto);
	}

	@Override
	public List<RoleDto> getAllRoles() {
		List<Role> roles = roleRepository.findAll();
		List<RoleDto> rolesDto = new ArrayList<>();
		if ( !roles.isEmpty()) {
			for (int i = 0; i < roles.size(); i++) {
				rolesDto.add(modelMapper.map(roles.get(i), RoleDto.class));

			}
		}

		return rolesDto;
	}

}
