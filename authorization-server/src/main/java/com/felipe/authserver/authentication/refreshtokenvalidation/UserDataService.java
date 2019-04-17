package com.felipe.authserver.authentication.refreshtokenvalidation;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Uses the received token to identify and retrieve the user
 * @author felipe
 *
 */
@Service
public class UserDataService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
		// TODO: change this to a real database connection
		User user = new User(1, "Felipe Pereira", "felipe.dspereira@gmail.com", "123");
		return new ResourceOwner(user);
	}

}
