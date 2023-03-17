package com.example.demo.controller1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellworld1 {

    @GetMapping("/hello-world-1")
    public ResponseEntity<String> helloWorld1() {
        return ResponseEntity.ok().body("hello world from 1");
    }
}
