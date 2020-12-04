package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidades_pedologicas", schema = "bases")
public class UnidadePedologica {

    @Id
    @Column(name = "gid")
    private Integer id;

    @Column(name = "codunidade")
    private String codUnidade;

    @Column(name = "legenda")
    private String legenda;

    @Column(name = "st_area_sh")
    private Double stArea;

    @Column(name = "st_length_")
    private Double stTamanho;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(String codUnidade) {
        this.codUnidade = codUnidade;
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public Double getStArea() {
        return stArea;
    }

    public void setStArea(Double stArea) {
        this.stArea = stArea;
    }

    public Double getStTamanho() {
        return stTamanho;
    }

    public void setStTamanho(Double stTamanho) {
        this.stTamanho = stTamanho;
    }
}
