package com.hazerta.EjerciciosSpring.SpringDataJPA.Ejercicio3;

import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

public class Bicicleta {

    private String numeroSerie;
    private String marca;
    private Double precio;

    @OneToOne
    @JoinColumn(name = "numero_serie", foreignKey = @ForeignKey(name="FK_BICICLETA"), referencedColumnName = "numeroSerie")
    private Electrica electrica;
}
