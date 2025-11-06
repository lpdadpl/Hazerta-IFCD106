package com.hazerta.Ejercicios.ejercicio06InterfacesExcepciones.ejercicio4DAO.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Component
public class ClienteDao extends Cliente{

    private IDao conexion;


}
