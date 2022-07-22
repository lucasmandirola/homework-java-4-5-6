package com.example.Homeworjs456.controller;


import com.example.Homeworjs456.entities.Laptop;
import com.example.Homeworjs456.repository.LaptopRepository;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpHeaders;
import java.util.List;

@RestController
public class LaptopController {
    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptops")
    public Laptop create(@RequestBody Laptop laptop){

        return laptopRepository.save(laptop);
    }
}
