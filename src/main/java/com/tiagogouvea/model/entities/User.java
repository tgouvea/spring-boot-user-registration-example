package com.tiagogouvea.model.entities;

import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
	

@Data
@Document(collection = "users")
public class User {

	@Id
	private String id;

	@Indexed(unique = true)
	private String email;

	private String password;

	private String name;

	private Set<String> authorities;

}