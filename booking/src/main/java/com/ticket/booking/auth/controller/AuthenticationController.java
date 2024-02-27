package com.ticket.booking.auth.controller;

import com.ticket.booking.auth.model.AuthenticationRequest;
import com.ticket.booking.auth.model.AuthenticationResponse;
import com.ticket.booking.auth.model.RegisterRequest;
import com.ticket.booking.auth.service.AuthenticationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
//@SecurityRequirement(name = "bearerAuth")
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register/user")
    public ResponseEntity<AuthenticationResponse> registerUser(@RequestBody RegisterRequest request){
        System.out.println("iceri girdim");
        return ResponseEntity.ok(service.registerUser(request));
    }

    @PostMapping("/register/admin")
    public ResponseEntity<AuthenticationResponse> registerAdmin(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.registerAdmin(request));
    }

    @GetMapping("/login/admin")
    public ResponseEntity<AuthenticationResponse> loginAdmin(@PathVariable String email ,@PathVariable
                                                             String password){

        return null;
        //return ResponseEntity.ok(service.registerAdmin(request));
    }




    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Success Authentication",
                    content = { @Content }),
            @ApiResponse(responseCode = "400", description = "Failed Authentication",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Failed Authentication",
                    content = @Content) })
    @PostMapping("/authenticate")
    @Operation(summary = "My endpoint", security = @SecurityRequirement(name = "bearerAuth"))

    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));


    }
}
