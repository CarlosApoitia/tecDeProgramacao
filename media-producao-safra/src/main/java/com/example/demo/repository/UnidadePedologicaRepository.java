package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UnidadePedologica;

@Repository
public interface UnidadePedologicaRepository extends JpaRepositoryImplementation<UnidadePedologica, Integer> {
}
