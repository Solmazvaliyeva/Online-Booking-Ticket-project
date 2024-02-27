package com.ticket.booking.auth.securityconfig;


import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final AuthenticationProvider authenticationProvider;
    private final JwtAuthenticationFilter authenticationFilter;


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        System.out.println("bura girdiiiii " + http);

        http
                .authorizeHttpRequests((auth) -> auth
                        .requestMatchers("/api/v1/auth/register/**").permitAll()
                       // .requestMatchers("/api/v1/auth/authenticate").authenticated()
                        .requestMatchers("/api/v0/event/**").hasAuthority("ADMIN")
                        .requestMatchers("/api/v0/address/**").hasAuthority("ADMIN")
                        .requestMatchers("/api/v1/auth/authenticate").permitAll()
                        .requestMatchers("/swagger-ui/**").permitAll()
                        .requestMatchers("/v2/api-docs").permitAll()
                        .requestMatchers("/swagger-resources/**").permitAll()
                        .requestMatchers("/swagger-ui.html").permitAll()
                        .requestMatchers("/v3/api-docs/**").permitAll()



                ).csrf(AbstractHttpConfigurer::disable).authenticationProvider(authenticationProvider)
                .addFilterBefore(authenticationFilter , UsernamePasswordAuthenticationFilter.class);




        System.out.println("bura girdiiiii " + http);
        return http.build();
    }
}
