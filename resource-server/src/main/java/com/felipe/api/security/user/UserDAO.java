package com.felipe.api.security.user;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Long> {
	
	Optional<User> getByUsername(String username);
	
}
