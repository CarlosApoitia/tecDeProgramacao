package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.IsoietaMedia;
import com.example.demo.model.enuns.Mes;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaMes {

    @Expose
    private Mes mes;

    @Expose
    @SerializedName("producao_media")
    private BigDecimal mediaTotal;

    @Expose
    @SerializedName("isoieta_mes")
    private List<IsoietaMedia> isoietaMedias;

    public MediaMes() {
    }

    public Mes getMes() {
        return mes;
    }

    public BigDecimal getMediaTotal() {
        return mediaTotal;
    }

    public List<IsoietaMedia> getIsoietaMedias() {
        return isoietaMedias;
    }

    public void setIsoietaMedias(List<IsoietaMedia> isoietaMedias) {
        this.isoietaMedias = isoietaMedias;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public void setMediaTotal(BigDecimal mediaTotal) {
        this.mediaTotal = Optional.ofNullable(mediaTotal).orElse(BigDecimal.ZERO)
                .setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
