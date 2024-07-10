package com.example.classproject.repository;

import com.example.classproject.entity.Abhishek;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbhishekRepository extends JpaRepository<Abhishek,Integer> {
}
