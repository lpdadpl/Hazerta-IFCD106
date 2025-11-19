package com.hazerta.web.repositorio;

import com.hazerta.web.modelo.Tarea;

import java.util.List;

public interface IRepositorioTarea {
    List<Tarea> consultarTodas();
    Tarea obtenerTareaPorId(Long id);
    List<Tarea> obtenerTareaPorNombre(String nombre);
    List<Tarea> obtenerTareasPorEstado(boolean completada);
    Tarea guardarTarea(Tarea tarea);
    void eliminarTarea(Long id);
}
