package com.hazerta.EjercicioTalleres.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class SeguroCoche {
    private String aseguradora;

    @Autowired
    @Qualifier("tallerPintura")
    private ITaller taller;
    @Autowired
    private Coche coche;
    public String reparar() {
        return "El coche " + coche.getModelo() + " ha sido reparado por el seguro "+ aseguradora + " en "+ taller.reparar();
    }

}
