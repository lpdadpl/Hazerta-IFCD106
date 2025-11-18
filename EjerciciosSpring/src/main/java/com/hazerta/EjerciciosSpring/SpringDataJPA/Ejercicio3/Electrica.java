package com.hazerta.EjerciciosSpring.SpringDataJPA.Ejercicio3;

import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Electrica {
       private String numeroSerie;
       private String tipoMotor;
       private Double potencia;


       @OneToOne
       @JoinColumn(name = "numero_serie", foreignKey = @ForeignKey(name="FK_ELECTRICA"), referencedColumnName = "numeroSerie")
        private Bicicleta bicicleta;
}
