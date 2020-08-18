package com.marsh.MarshAssesmentMongo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	// Authentication : User --> Roles
		protected void configure(AuthenticationManagerBuilder auth)
				throws Exception {
			auth.inMemoryAuthentication().withUser("user").password("{noop}secret")
					.roles("USER");
		}

		// Authorization : Role -> Access
		protected void configure(HttpSecurity http) throws Exception {
			http.httpBasic().and().authorizeRequests().
			 antMatchers(HttpMethod.GET, "/info/**").hasRole("USER")
             .antMatchers(HttpMethod.POST, "/info").hasRole("USER")
             .antMatchers(HttpMethod.PUT, "/info").hasRole("USER")
             .antMatchers(HttpMethod.DELETE, "/info").hasRole("USER")
			 .and()
			.csrf().disable()
			.formLogin().disable();
		}
}