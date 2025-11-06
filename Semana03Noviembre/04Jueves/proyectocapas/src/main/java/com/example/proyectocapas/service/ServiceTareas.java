package com.example.proyectocapas.service;

import com.example.proyectocapas.modelo.Tarea;
import com.example.proyectocapas.persistencia.AccesoTareas;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTareas {

    @Autowired
    private AccesoTareas accesoTareas;

    public String guardarTarea(Tarea t1) {
        if (t1.getDescription() == null || t1.getDescription().isEmpty()) {
            return "error: la descripcion no puede estar vacio";
        }
        return "pasa por la capa de servicio";
    }


}
