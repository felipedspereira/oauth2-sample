package com.felipe.authserver.oauth.jwt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * Spring configurations for JWT with simetric keys
 * 
 * @author felipe
 * 
 */
@Configuration
public class JWTConfig {

	// TODO: don't keep this hardcoded when dealingi with real production apps
	private static final String SIGNATURE = "assinatura-bookserver";

	@Bean
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
		converter.setSigningKey(SIGNATURE);
		return converter;
	}

	@Bean
	public JwtTokenStore jwtTokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}

	@Bean
	@Primary
	public DefaultTokenServices tokenServices() {
		DefaultTokenServices tokenServices = new DefaultTokenServices();
		tokenServices.setTokenStore(jwtTokenStore());
		tokenServices.setSupportRefreshToken(true);
		return tokenServices;
	}

}
