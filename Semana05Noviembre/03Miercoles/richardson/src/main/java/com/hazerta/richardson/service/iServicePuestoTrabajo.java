package com.hazerta.richardson.service;

import com.hazerta.richardson.entity.PuestoTrabajo;

import java.util.List;

public interface iServicePuestoTrabajo  {
    List<PuestoTrabajo> obtenerTodosLosPuestosTrabajo();
    PuestoTrabajo obtenerPuestoTrabajoPorId(int id);
    PuestoTrabajo crearPuestoTrabajo(PuestoTrabajo puestoTrabajo);
    PuestoTrabajo actualizarPuestoTrabajo(PuestoTrabajo puestoTrabajo);
    void eliminarPuestoTrabajo(int id);
}
