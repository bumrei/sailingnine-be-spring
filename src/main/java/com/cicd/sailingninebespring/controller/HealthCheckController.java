package com.cicd.sailingninebespring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequiredArgsConstructor
public class HealthCheckController {

    @GetMapping("/health/check")
    public ResponseEntity<String> healthCheck() {

        String msg = "This api works well!";

        HashMap<String, Object> result = new HashMap<>();

        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json; charset=UTF-8");

        return new ResponseEntity<>(msg,header, HttpStatus.OK);
    }

}
