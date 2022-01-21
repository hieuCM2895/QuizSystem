package com.fsoft.quizsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthenticationController {

    @GetMapping("login")
    String showLoginPage() {
        return "Login";
    }

    @GetMapping("register")
    String showSignUpPage() {
        return "SignUp";
    }
}
