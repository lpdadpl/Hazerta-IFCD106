package com.hazerta.Ejercicios.ejercicio4DAO.modelo;


import lombok.Data;
import org.springframework.stereotype.Component;

@Data

@Component
public class AccesoProduccion implements IDao {
    @Override
    public String insertar(Cliente c) {
        return " produccion";
    }
}
