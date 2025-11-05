package com.hazerta.EjercicioTalleres.modelo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data

@Component
public class TallerMecanica implements ITaller {
    @Override
    public String reparar() {
        return "Taller de mecanica";
    }
}
