package com.example.demo.controller2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworld2 {

    @GetMapping("/hello-world-2")
    public ResponseEntity<String> helloWorld2() {
        return ResponseEntity.ok().body("hello world from 2");
    }
}
