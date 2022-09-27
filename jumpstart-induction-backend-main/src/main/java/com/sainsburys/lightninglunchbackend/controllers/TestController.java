package com.sainsburys.lightninglunchbackend.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("{text}")
    public ResponseEntity<?> helloWorld(@PathVariable("text") String text) {
        return ResponseEntity.ok(text);
    }
}
