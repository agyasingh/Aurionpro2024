//package com.aurionpro.jpacrud.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.aurionpro.jpacrud.repository.UserRepository;
//
//import jakarta.validation.Valid;
//
//@RestController
//public class UserController {
//	@Autowired
//	private UserRepository userrepo;
//
//    @PostMapping("/users")
//    public ResponseEntity<String> addUser(@Valid @RequestBody User user) {
//        // persisting the user
//        return ResponseEntity.ok("User is valid");
//    }
//    
//    // standard constructors / other methods
//    
//}
