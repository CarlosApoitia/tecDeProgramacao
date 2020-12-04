package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.AptidaoAgricolaRepository;

@Service
public class AptidaoAgricolaService {

    private final AptidaoAgricolaRepository aptidaoAgricolaRepository;

    @Autowired
    public AptidaoAgricolaService(AptidaoAgricolaRepository aptidaoAgricolaRepository) {
        this.aptidaoAgricolaRepository = aptidaoAgricolaRepository;
    }
}
