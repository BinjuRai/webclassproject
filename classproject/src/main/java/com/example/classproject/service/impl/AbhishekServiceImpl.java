package com.example.classproject.service.impl;

import com.example.classproject.entity.Abhishek;
import com.example.classproject.pojo.AbhisekPojo;
import com.example.classproject.repository.AbhishekRepository;
import com.example.classproject.service.AbhishekService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AbhishekServiceImpl implements AbhishekService {

    private final AbhishekRepository abhishekRepository;

    @Override
    public void save(AbhisekPojo abhishekPojo) {

        Abhishek abhishek = new Abhishek();

        abhishek.setId(abhishekPojo.getId());
        abhishek.setHeight(abhishekPojo.getHeight());
        abhishek.setWeight(abhishekPojo.getWeight());

        abhishekRepository.save(abhishek);

    }

    @Override
    public List<Abhishek> findAll() {
        return abhishekRepository.findAll();
    }
}
