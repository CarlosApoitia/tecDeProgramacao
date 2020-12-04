package com.example.demo.model.enuns;

import java.util.Arrays;

import com.google.gson.annotations.SerializedName;

public enum Mes {

    @SerializedName("Janeiro")   JAN(1),
    @SerializedName("Fevereiro") FEV(2),
    @SerializedName("Março")     MAR(3),
    @SerializedName("Abril")     ABR(4),
    @SerializedName("Maio")      MAI(5),
    @SerializedName("Junho")     JUN(6),
    @SerializedName("Julho")     JUL(7),
    @SerializedName("Agosto")    AGO(8),
    @SerializedName("Setembro")  SET(9),
    @SerializedName("Outubro")   OUT(10),
    @SerializedName("Novembro")  NOV(11),
    @SerializedName("Dezembro")  DEZ(12);

    Mes(Integer num) {
        this.num = num;
    }

    private final Integer num;

    public Integer getNum() {
        return num;
    }

    public static Mes getById(final Integer id) {
        return Arrays.stream(values()).filter(
                mes -> mes.getNum().equals(id)
        ).findFirst().orElse(null);
    }
}

