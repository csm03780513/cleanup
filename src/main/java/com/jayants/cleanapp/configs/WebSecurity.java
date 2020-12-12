package com.jayants.cleanapp.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;

public class WebSecurity {
//    @EnableWebSecurity
//    public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception{
//            http.csrf().disable().authorizeRequests()
//                    .antMatchers("/").permitAll()
//                    .antMatchers(HttpMethod.POST,"/adduser").permitAll()
//                    .antMatchers(HttpMethod.POST, "/login").permitAll()
//                    .antMatchers(HttpMethod.POST,"/newuser/*").permitAll()
//                    .antMatchers(HttpMethod.GET,"/master/*").permitAll()
//                    .antMatchers(HttpMethod.GET,"/exploreCourse").permitAll()
//                    .anyRequest().authenticated();
//        }

        @Bean
        CorsConfigurationSource corsConfigurationSource() {
            CorsConfiguration configuration = new CorsConfiguration();
            configuration.setAllowedOrigins(Arrays.asList("*"));
            configuration.setAllowedMethods(Arrays.asList("*"));
            configuration.setAllowedHeaders(Arrays.asList("*"));
            configuration.setAllowCredentials(true);
            UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
            source.registerCorsConfiguration("/**", configuration);
            return source;
        }

    }

