package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UnidadeLitoestratigrafica;

@Repository
public interface UnidadeLitoestratigraficaRepository extends JpaRepositoryImplementation<UnidadeLitoestratigrafica, Integer> {
}
