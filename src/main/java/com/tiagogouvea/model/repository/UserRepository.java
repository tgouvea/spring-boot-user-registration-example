package com.tiagogouvea.model.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiagogouvea.model.entities.User;

public interface UserRepository extends CrudRepository<User, Long>{

	Page<User> findAll(Pageable pageable);
	
}
