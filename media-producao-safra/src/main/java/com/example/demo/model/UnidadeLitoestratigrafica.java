package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "unidades_litoestratigraficas", schema = "bases")
public class UnidadeLitoestratigrafica {

    @Id
    @Column(name = "gid")
    private Integer id;

    @Column(name = "codnomunid")
    private Long codMunicipio;

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

    public Long getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(Long codMunicipio) {
        this.codMunicipio = codMunicipio;
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
