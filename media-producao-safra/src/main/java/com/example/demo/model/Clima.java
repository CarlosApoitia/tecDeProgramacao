package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clima_mt_5000", schema = "bases")
public class Clima {

    @Id
    @Column(name = "gid")
    private Integer id;

    @Column(name = "zona")
    private String zona;

    @Column(name = "tp_umidade")
    private String umidade;

    @Column(name = "distr_umid")
    private String distrUmidade;

    @Column(name = "temperatur")
    private String temperatra;

    @Column(name = "desc_compl")
    private String descricaoComplementar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getUmidade() {
        return umidade;
    }

    public void setUmidade(String umidade) {
        this.umidade = umidade;
    }

    public String getDistrUmidade() {
        return distrUmidade;
    }

    public void setDistrUmidade(String distrUmidade) {
        this.distrUmidade = distrUmidade;
    }

    public String getTemperatra() {
        return temperatra;
    }

    public void setTemperatra(String temperatra) {
        this.temperatra = temperatra;
    }

    public String getDescricaoComplementar() {
        return descricaoComplementar;
    }

    public void setDescricaoComplementar(String descricaoComplementar) {
        this.descricaoComplementar = descricaoComplementar;
    }
}
