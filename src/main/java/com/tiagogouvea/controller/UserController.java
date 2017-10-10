package com.tiagogouvea.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiagogouvea.model.repository.UserRepository;
import com.tiagogouvea.model.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserRepository repository;
	
	@GetMapping()
	public String get() {
		
		
		return "user/save";
	}
	
	@PostMapping()
	public String save() {
		
		
		return "login";
	}
	
	@PutMapping()
	public String alter() {
		
		
		return "login";
	}
	
	@DeleteMapping()
	public String delete() {
		
		
		return "login";
	}
	
}
