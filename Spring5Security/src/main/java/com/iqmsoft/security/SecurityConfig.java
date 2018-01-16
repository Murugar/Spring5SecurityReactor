package com.iqmsoft.security;

import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.userdetails.MapUserDetailsRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsRepository;

@Slf4j
@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

  @Bean 
  UserDetailsRepository userDetailsRepository() {
    val user = User.withUsername("user1").password("user1").roles("USER").build();
    return new MapUserDetailsRepository(user);
  }


}
