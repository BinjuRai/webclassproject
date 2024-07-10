package com.example.classproject.service;

import com.example.classproject.entity.Abhishek;
import com.example.classproject.pojo.AbhisekPojo;

import java.util.List;

public interface AbhishekService {

    void save(AbhisekPojo abhishekPojo);

    List<Abhishek> findAll();
}
