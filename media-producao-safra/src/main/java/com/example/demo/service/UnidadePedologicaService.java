package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UnidadePedologicaRepository;

@Service
public class UnidadePedologicaService {

    private final UnidadePedologicaRepository unidadePedologicaRepository;

    @Autowired
    public UnidadePedologicaService(UnidadePedologicaRepository unidadePedologicaRepository) {
        this.unidadePedologicaRepository = unidadePedologicaRepository;
    }
}
