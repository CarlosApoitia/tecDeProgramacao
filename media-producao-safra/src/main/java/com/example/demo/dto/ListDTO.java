package com.example.demo.dto;

import java.util.List;

import com.google.gson.annotations.Expose;

public class ListDTO<T> {

    @Expose
    private final String titulo;

    @Expose
    private final List<T> resultado;

    public ListDTO(String titulo, List<T> resultado) {
        this.titulo = titulo;
        this.resultado = resultado;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<T> getResultado() {
        return resultado;
    }
}
