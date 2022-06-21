package com.example.springhelloworld.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<String> helloWorld(@PathVariable String name) {
        return ResponseEntity.ok("Hello, " + name) ;
    }
}