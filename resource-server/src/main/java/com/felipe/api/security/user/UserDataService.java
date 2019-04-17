package com.felipe.api.security.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Uses the received token to identify and retrieve the user
 * 
 * @author felipe
 *
 */
@Service
public class UserDataService implements UserDetailsService {

	@Autowired
	private UserDAO dao;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		// @formatter:off
		return dao.getByUsername(email)
				.map(ResourceOwner::new)
				.orElseThrow(() -> new UsernameNotFoundException(email));
		// @formatter:on
	}

}
