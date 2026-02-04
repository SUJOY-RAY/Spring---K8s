package com.springk8.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springk8.config.AppConfig;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Slf4j
public class HelloController {
    private final AppConfig appConfig;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        log.info("Recieved /hello request.");
        return ResponseEntity.ok("Hello from " + appConfig.getAppName());
    }
    
}
