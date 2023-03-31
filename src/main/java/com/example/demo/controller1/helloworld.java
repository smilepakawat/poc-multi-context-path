package com.example.demo.controller1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld {

    @GetMapping("/hello-world")
    public ResponseEntity<String> helloWorld1() {
        return ResponseEntity.ok().body("hello world from 0");
    }
}
