package com.optimagrowth.organization.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import com.optimagrowth.organization.service.OrganizationService;

public class ResourceServerConfiguration {
	
}

/*@Configuration
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

	private static final Logger logger = LoggerFactory.getLogger(ResourceServerConfiguration.class);
	
    @Override
    public void configure(HttpSecurity http) throws Exception{
    	
    	logger.debug("start configure");  	
    	http
        .authorizeRequests()
         .antMatchers(HttpMethod.DELETE, "/v1/organization/**")
         .hasRole("ADMIN")
         .anyRequest()
         .authenticated();
    	logger.debug("end configure");  	
    }
}*/