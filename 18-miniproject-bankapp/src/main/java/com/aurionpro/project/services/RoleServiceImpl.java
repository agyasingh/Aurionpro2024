//package com.aurionpro.project.services;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.aurionpro.project.entities.Role;
//import com.aurionpro.project.repositories.RoleRepository;
//
//@Service
//public class RoleServiceImpl implements RoleService {
//	@Autowired
//	private RoleRepository roleRepository;
//
//	@Override
//	public Role createRole(String roleName) {
//	    Role role = new Role();
//	    role.setRolename(roleName);
//	    return roleRepository.save(role);
//	}
//}
