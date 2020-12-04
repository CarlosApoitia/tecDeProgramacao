package com.example.demo.dto;

import java.math.BigDecimal;
import java.util.Optional;

import com.example.demo.model.enuns.Mes;

public class IsoietaMes {

    private Mes mes;
    private BigDecimal mediaTotal;

    public IsoietaMes() {
    }

    public Mes getMes() {
        return mes;
    }

    public BigDecimal getMediaTotal() {
        return mediaTotal;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public void setMediaTotal(BigDecimal mediaTotal) {
        this.mediaTotal = Optional.ofNullable(mediaTotal).orElse(BigDecimal.ZERO)
                .setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
