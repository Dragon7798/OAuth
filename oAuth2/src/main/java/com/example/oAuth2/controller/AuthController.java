package com.example.oAuth2.controller;


import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class AuthController {

    @GetMapping("/hello")
    public Map<String, Object> response(OAuth2AuthenticationToken auth2AuthenticationToken) {
    	
        return auth2AuthenticationToken.getPrincipal().getAttributes();
    }
}
