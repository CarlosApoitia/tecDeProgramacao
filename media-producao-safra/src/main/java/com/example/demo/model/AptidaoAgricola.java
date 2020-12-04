package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "classe_aptidao_agricola", schema = "bases")
public class AptidaoAgricola {

    @Id
    @Column(name = "gid")
    private Integer id;

    @Column(name = "descricao_")
    private String descicao;

    @Column(name = "sigla_12_1")
    private String sigla;

    @Column(name = "sigla_12_2")
    private String sigla2;

    @Column(name = "sigla_12_3")
    private String sigla3;

    @Column(name = "seqclassea")
    private Double classeAptidao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla2() {
        return sigla2;
    }

    public void setSigla2(String sigla2) {
        this.sigla2 = sigla2;
    }

    public String getSigla3() {
        return sigla3;
    }

    public void setSigla3(String sigla3) {
        this.sigla3 = sigla3;
    }

    public Double getClasseAptidao() {
        return classeAptidao;
    }

    public void setClasseAptidao(Double classeAptidao) {
        this.classeAptidao = classeAptidao;
    }
}
