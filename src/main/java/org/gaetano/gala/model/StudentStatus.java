package org.gaetano.gala.model;

import java.util.Objects;

public enum StudentStatus {

    IN_CORSO(20),
    FUORI_CORSO(90),
    ISCRITTO(30),
    LAUREANDO(10),
    RITIRATO(0),
    SOSPESO(5);

    private Integer tax;

    StudentStatus(Integer tax) {
        this.tax = tax;
    }

    public Integer getTax(){
        return tax;
    }

    public static StudentStatus getStatusByTax(Integer tax){
        for (StudentStatus value : values()) {
            if (Objects.equals(value.getTax(), tax))
                return value;
        }
        return null;
    }


}
