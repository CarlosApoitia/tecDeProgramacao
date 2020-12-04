package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dto.ListDTO;
import com.example.demo.dto.MediaMes;
import com.example.demo.service.MediaProducaoService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@SpringBootApplication
public class MainApplication {

    private static Gson gson;

    private static MediaProducaoService producaoService;

    @Autowired
    public MainApplication(MediaProducaoService mediaProducaoService) {
        producaoService = mediaProducaoService;
        gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);

        System.out.println("\nINICIANDO CONSULTA DE DADOS...");

        long tempoInicial = System.currentTimeMillis();
        List<MediaMes> mediaProducaos = producaoService.mediaProducaoMes();
        System.out.println("TEMPO DE RESPOSTA: " + (System.currentTimeMillis() - tempoInicial) + "ms");

        System.out.println("RESULTADOS OBTIDOS: \n");
        System.out.println(gson.toJson(new ListDTO<>("Média de produção por mês", mediaProducaos)));
    }

}
