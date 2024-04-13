package com.example.oAuth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class OConfig {


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .cors()
                        .and()
                                .csrf()
                                        .disable().
                authorizeHttpRequests(auth ->{
                        auth.anyRequest().authenticated();
                })
                .formLogin(Customizer.withDefaults())
                
                .oauth2Login(Customizer.withDefaults())
                .build();
    }
}
