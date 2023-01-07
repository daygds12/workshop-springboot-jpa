package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//controlador rest que responde no caminho Users
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u =  new User(1L, "MARIA", "maria@.com","99999999", "ppppp");
		return ResponseEntity.ok().body(u);
	}
}
