package com.ticket.booking.auth.service;

import com.ticket.booking.auth.dao.AuthenticationRequest;
import com.ticket.booking.auth.dao.AuthenticationResponse;
import com.ticket.booking.auth.dao.RegisterRequest;
import com.ticket.booking.auth.dao.User;
import com.ticket.booking.auth.dao.Role;
import com.ticket.booking.exception.NoDataFoundException;
import com.ticket.booking.repository.UserRepository;
import com.ticket.booking.securityconfig.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse registerUser(RegisterRequest request){
        var user=  User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)

                .build();

        System.out.println("iceri girdim2");
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse registerAdmin(RegisterRequest request){
        var user=  User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.ADMIN)

                .build();
        repository.save(user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request){
        System.out.println(request);


        UsernamePasswordAuthenticationToken token=
                new UsernamePasswordAuthenticationToken(request.getEmail() ,request.getPassword());
        System.out.println("token " + token);

        var user = repository.findByEmail(request.getEmail()).orElseThrow(() ->
                new NoDataFoundException("Email not found at system.Do you want to sign up?"));
        System.out.println("user +" + user);
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();

    }




}
