package com.example.classproject.controller;

import com.example.classproject.pojo.UserPojo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @PostMapping
    public void saveData(@RequestBody  UserPojo userPojo){

    }
}
