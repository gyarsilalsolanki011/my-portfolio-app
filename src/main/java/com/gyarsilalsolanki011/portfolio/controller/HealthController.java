package com.gyarsilalsolanki011.portfolio.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health-check")
    public ResponseEntity<String> health() {
        return ResponseEntity.ok("I am healthy");
    }
}

