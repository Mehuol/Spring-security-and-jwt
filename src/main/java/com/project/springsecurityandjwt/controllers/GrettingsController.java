package com.project.springsecurityandjwt.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GrettingsController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from the API");
    }

    @GetMapping("/goodbye")
    public ResponseEntity<String> goodbye(){
        return ResponseEntity.ok("Good bye and see you later");
    }
}
