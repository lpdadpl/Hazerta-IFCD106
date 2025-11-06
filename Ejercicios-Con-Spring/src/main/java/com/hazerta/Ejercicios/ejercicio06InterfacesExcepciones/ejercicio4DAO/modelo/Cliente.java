package com.hazerta.Ejercicios.ejercicio06InterfacesExcepciones.ejercicio4DAO.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Component
public class Cliente {
    private String nombre;
    private String NIF;

}
