package com.example.classproject.controller;

import com.example.classproject.entity.Abhishek;
import com.example.classproject.pojo.AbhisekPojo;
import com.example.classproject.service.AbhishekService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abhishek")
@RequiredArgsConstructor
public class AbhishekController {

    private final AbhishekService abhishekService;

    @PostMapping
    public void save(@RequestBody AbhisekPojo abhishekPojo){
        abhishekService.save(abhishekPojo);
    }

    @GetMapping
    public List<Abhishek> findAll(){
 return abhishekService.findAll();
    }
}
