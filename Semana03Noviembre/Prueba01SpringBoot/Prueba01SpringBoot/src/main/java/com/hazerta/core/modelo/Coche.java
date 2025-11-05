package com.hazerta.core.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Coche implements IVehiculo{

    protected int deposito;

    @Override
    public String moverse() {

        if(deposito>0){
            return "el coche se esta moviendo";
        }else(deposito=== null){
            return "no se tienen datos del deposito";
        }
        return "Se necesita ir a la gasolinera";
    }
}
