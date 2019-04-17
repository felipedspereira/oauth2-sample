package com.felipe.api.security.user;

import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.annotation.RequestScope;

/**
 * Retrieves the user from the received token
 * 
 * @author felipe
 *
 */

@Configuration
public class SessionUserConfig {

	@Bean
	@RequestScope
	public User user() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return Optional.ofNullable(authentication)
				.map(auth -> (ResourceOwner) auth.getPrincipal())
				.map(rOwner -> rOwner.getUser())
				.orElseThrow(() -> new IllegalStateException("No logged in user found"));
	}

}
