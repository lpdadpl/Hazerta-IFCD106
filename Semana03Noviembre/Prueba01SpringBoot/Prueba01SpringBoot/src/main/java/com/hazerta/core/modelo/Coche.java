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

    protected Integer deposito;

    @Override
    public String moverse() {

        if(deposito == null){
            return "no se tienen datos del deposito";
        } else if(deposito>0){
            return "el coche se esta moviendo";
        }
        return "Se necesita ir a la gasolinera";
    }
}
