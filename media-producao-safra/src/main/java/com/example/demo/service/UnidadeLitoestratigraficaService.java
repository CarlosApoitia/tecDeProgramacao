package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UnidadeLitoestratigraficaRepository;

@Service
public class UnidadeLitoestratigraficaService {

    private final UnidadeLitoestratigraficaRepository unidadeLitoestratigraficaRepository;

    @Autowired
    public UnidadeLitoestratigraficaService(UnidadeLitoestratigraficaRepository unidadeLitoestratigraficaRepository) {
        this.unidadeLitoestratigraficaRepository = unidadeLitoestratigraficaRepository;
    }
}
