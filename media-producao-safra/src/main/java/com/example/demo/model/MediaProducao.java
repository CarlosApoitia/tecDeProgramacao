package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_media_producao", schema = "bases")
public class MediaProducao {

    @Id
    @Column(name = "media_producao_id")
    private Long id;

    @Column(name = "calendario_safra_id")
    private Integer mesCalendario;

    @Column(name = "produto_id")
    private Long idProduto;

    @Column(name = "media_producao_mun_id")
    private Long idMunicipio;

    @Column(name = "media_producao_fator")
    private BigDecimal fatorProducao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMesCalendario() {
        return mesCalendario;
    }

    public void setMesCalendario(Integer mesCalendario) {
        this.mesCalendario = mesCalendario;
    }

    public Long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Long idProduto) {
        this.idProduto = idProduto;
    }

    public Long getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Long idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public BigDecimal getFatorProducao() {
        return fatorProducao;
    }

    public void setFatorProducao(BigDecimal fatorProducao) {
        this.fatorProducao = fatorProducao;
    }
}
