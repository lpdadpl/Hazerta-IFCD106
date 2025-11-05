package com.hazerta.Ejercicio04_DAO.modelo;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Data

@Component
@Primary
public class AccesoDesarrollo implements IDao{

    @Override
    public String insertar(Cliente c) {
        return " desarrollo";
    }
}
