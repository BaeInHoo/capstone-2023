package com.example.demo.security;

import com.example.demo.domain.dto.UserDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
 * created on 2023/11/01
 * */
public class SecurityConfig {

    public UserDTO user;

    @Bean
    public void FilterChain(AuthenticationManagerBuilder auth, PasswordEncoder passwordEncoder) throws Exception{
        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser(user.getUser_id())
                .password(user.getPwd())
                .roles("USER");

        auth.inMemoryAuthentication()
                .passwordEncoder(passwordEncoder)
                .withUser("admin")
                .password("1234")
                .roles("ADMIN");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
