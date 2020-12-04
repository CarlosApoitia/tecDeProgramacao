package com.example.demo.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity
@Table(name = "isoietas_medias", schema = "bases")
public class IsoietaMedia {

    @Id
    @Column(name = "mes")
    private Integer mes;

    @Expose
    @SerializedName("media_isoieta")
    @Column(name = "media_isoietas")
    private BigDecimal mediaTotal;

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public BigDecimal getMediaTotal() {
        return mediaTotal;
    }

    public void setMediaTotal(BigDecimal mediaTotal) {
        this.mediaTotal = mediaTotal;
    }
}
