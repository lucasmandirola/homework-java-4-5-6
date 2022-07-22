package com.example.Homeworjs456.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/saludo")
    public String saludar(){
        return "hola mundo";
    }
}
