package com.dbmsproj.rentabike.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import com.dbmsproj.rentabike.service.*;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.crypto.password.NoOpPasswordEncoder.getInstance;
import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebSecurity
public class securityconfiguration {
    @Autowired
    @Qualifier("Check")
    private userservice userservice;

    securityconfiguration(userservice userService) {
        this.userservice = userService;
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        UserDetailsService userService;
        auth.userDetailsService(userservice).passwordEncoder(getInstance());
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((auth) -> auth
//                                .requestMatchers("/login","/signin","/register","/home","/").permitAll()
                                .requestMatchers("/login","/signin").permitAll()
                                .anyRequest().authenticated()
//                        .requestMatchers("/signin", "/signup","/login","/css/login.css", "/register","/css/*","/js/*","/pics/*").permitAll()
//                        .requestMatchers("/restaurants").hasRole("ADMIN")
//                        .anyRequest().authenticated()
                )
                .formLogin((formLogin) -> formLogin
                        .loginPage("/signin")
                        .loginProcessingUrl("/login")
                        .defaultSuccessUrl("/home", true)

                )
                .httpBasic(withDefaults());
        return http.csrf(AbstractHttpConfigurer::disable).build();
    }
}