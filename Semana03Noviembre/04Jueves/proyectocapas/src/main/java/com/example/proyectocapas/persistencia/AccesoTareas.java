package com.example.proyectocapas.persistencia;

import com.example.proyectocapas.modelo.Tarea;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccesoTareas {

    public String guardarTarea(Tarea t){
        return "Tarea Guardada";
    }

    public Tarea obtenerTarea(int id){
        return new Tarea(id, "Tarea de ejemplo");
    }


    public List<Tarea> obtenerTodasLasTareas(){
        return List.of(
                new Tarea(234, "tarea larga"),
                new Tarea(56, "tarea corta"),
                new Tarea(45, "tarea chorra")
        );
    }

    public String eliminarTarea(int id){
        return "Tarea con id "+id+" fue eliminada";
    }


}
