package com.hazerta.web.servicio;

import com.hazerta.web.modelo.Tarea;

import java.util.List;

public interface IServicioTarea {
    List<Tarea> consultarTodas();
    Tarea obtenerTareaPorId(Long id);
    List<Tarea> obtenerTareaPorNombre(String nombre);
    List<Tarea> obtenerTareaPorEstado(boolean completada);
    Tarea guardarTarea(Tarea tarea);
    void eliminarTarea(Long id);

}
