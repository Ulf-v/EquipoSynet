package com.synet.demoBack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/index.html").permitAll()
                .requestMatchers("/pages/select_page.html", "/api/**").authenticated()
                .anyRequest().permitAll()
        )
        .oauth2Login(oauth -> oauth
                .loginPage("/login")
                .defaultSuccessUrl("/pages/select_page.html", true)
        );

        return http.build();
    }
}
