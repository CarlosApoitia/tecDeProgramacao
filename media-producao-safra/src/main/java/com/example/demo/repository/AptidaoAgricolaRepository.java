package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AptidaoAgricola;

@Repository
public interface AptidaoAgricolaRepository extends JpaRepositoryImplementation<AptidaoAgricola, Integer> {
}
