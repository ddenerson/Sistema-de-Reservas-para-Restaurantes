package com.bistrocontrol.bistro_control.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {
    
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }
}
