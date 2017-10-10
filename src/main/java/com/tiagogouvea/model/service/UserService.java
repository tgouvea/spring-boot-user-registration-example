package com.tiagogouvea.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tiagogouvea.model.entities.User;


public interface UserService {
	
	public Page<User> findAll(Pageable pageable);

	public void save(User user);

}
