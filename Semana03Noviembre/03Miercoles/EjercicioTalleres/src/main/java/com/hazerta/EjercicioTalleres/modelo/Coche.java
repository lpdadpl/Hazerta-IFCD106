package com.hazerta.EjercicioTalleres.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Component
public class Coche {

    private String matricula;
    private String modelo;
}


