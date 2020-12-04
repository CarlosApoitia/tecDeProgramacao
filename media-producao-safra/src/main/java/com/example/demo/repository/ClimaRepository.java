package com.example.demo.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Clima;

@Repository
public interface ClimaRepository extends JpaRepositoryImplementation<Clima, Integer> {
}
