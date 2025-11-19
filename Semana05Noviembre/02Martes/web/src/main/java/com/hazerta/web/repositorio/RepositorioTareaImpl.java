package com.hazerta.web.repositorio;

import com.hazerta.web.modelo.Tarea;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RepositorioTareaImpl implements IRepositorioTarea{


    private List<Tarea> listaTareas = new ArrayList<>(List.of(
            new Tarea(1L, "Tarea de ejemplo", false),
            new Tarea(2L, "Otra tarea de ejemplo", true),
            new Tarea(3L, "Revisar correos pendientes", false),
            new Tarea(4L, "Estudiar Spring Boot", true),
            new Tarea(5L, "Preparar reunión del viernes", false),
            new Tarea(6L, "Actualizar documentación del proyecto", true)
    ));

    @Override
    public List<Tarea> consultarTodas() {
        return listaTareas;
    }

    @Override
    public Tarea obtenerTareaPorId(Long id) {
        return new Tarea(id, "Tarea con ID " + id, true);
    }

    @Override
    public List<Tarea> obtenerTareaPorNombre(String nombre) {
        return listaTareas.stream().toList();
    }

    @Override
    public List<Tarea> obtenerTareasPorEstado(boolean completada) {
        return listaTareas.stream().toList();
    }

    @Override
    public Tarea guardarTarea(Tarea tarea) {
        return new Tarea(1L, "Tarea con ID ", true);
    }

    @Override
    public void eliminarTarea(Long id) {

    }
}
