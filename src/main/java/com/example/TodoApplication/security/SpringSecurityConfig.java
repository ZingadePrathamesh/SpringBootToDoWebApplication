package com.example.TodoApplication.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfig {
	
	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {
		
		
		Function<String, String> passWordEncoder =
				input -> passwordEncoder().encode(input);
				
				
		UserDetails userDetails = User.builder()
				.passwordEncoder(passWordEncoder )
				.username("prathamesh")
				.password("dummy")
				.roles("USER", "ADMIN")
				.build();		
		return new InMemoryUserDetailsManager(userDetails);
	}
	
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
