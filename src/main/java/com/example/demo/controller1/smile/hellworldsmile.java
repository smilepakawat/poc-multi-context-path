package com.example.demo.controller1.smile;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellworldsmile {

    @GetMapping("/hello-world-smile")
    public ResponseEntity<String> helloWorld1() {
        return ResponseEntity.ok().body("hello world from smile");
    }
}
