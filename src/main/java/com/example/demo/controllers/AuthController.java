package com.example.demo.controllers;

import com.example.demo.security.JwtAuthenticationEntryPoint;
import com.example.demo.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class AuthController {

    private AuthService authService;

    //build login rest api
    @PostMapping("/login")
    public ResponseEntity<JwtAuthenticationEntryPoint> authenticate(@RequestBody LoginDto loginDto) {
        String token = authService.login(loginDto);

        JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint = new JwtAuthenticationEntryPoint();
        jwtAuthenticationEntryPoint.setAccessToken(token);

        return ResponseEntity.ok(jwtAuthenticationEntryPoint);
    }
}
