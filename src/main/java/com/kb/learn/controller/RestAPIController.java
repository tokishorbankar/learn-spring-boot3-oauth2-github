package com.kb.learn.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/account")
public class RestAPIController {

    @GetMapping
    public ResponseEntity<String> getAPIHealthCheck() {
        return ResponseEntity.ok("API is running and it's secured from the auth server.");
    }
}
