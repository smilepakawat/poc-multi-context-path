package com.example.demo.controller3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mind")
public class helloworld3 {

    @GetMapping("/hello-world-3")
    public ResponseEntity<String> helloWorld3() {
        return ResponseEntity.ok().body("hello world from 3");
    }
}
