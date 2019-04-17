package com.felipe.authserver.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {
	
	@Bean(name = "dsOauth")
	@ConfigurationProperties(prefix = "spring.ds-oauth")
	public DataSource oauthDataSource() {
		return DataSourceBuilder.create().build();
	}
}
