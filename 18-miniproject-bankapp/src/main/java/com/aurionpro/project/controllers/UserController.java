package com.aurionpro.project.controllers;

import com.aurionpro.project.dto.UserDto;
import com.aurionpro.project.entities.Role;
import com.aurionpro.project.entities.User;
import com.aurionpro.project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto) {
        UserDto createdUser = userService.addUser(userDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    
//    @Autowired
//    private RoleService roleService;
//
//    @PostMapping("/createrole")
//    public ResponseEntity<Role> addRole(@RequestBody String rolename) {
//       
//           Role role = roleService.createRole(rolename);
//            return new ResponseEntity<>(role, HttpStatus.CREATED);
//        
//     
//    }
}
