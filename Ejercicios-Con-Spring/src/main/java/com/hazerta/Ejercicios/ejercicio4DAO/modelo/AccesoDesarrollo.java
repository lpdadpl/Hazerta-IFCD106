package com.hazerta.Ejercicios.ejercicio4DAO.modelo;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data

@Component
@Primary
public class AccesoDesarrollo implements IDao {

    @Override
    public String insertar(Cliente c) {
        return " desarrollo";
    }
}
