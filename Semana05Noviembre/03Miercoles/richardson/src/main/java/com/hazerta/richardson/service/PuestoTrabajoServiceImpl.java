package com.hazerta.richardson.service;

import com.hazerta.richardson.entity.PuestoTrabajo;
import com.hazerta.richardson.repository.iPuestoTrabajoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PuestoTrabajoServiceImpl implements iServicePuestoTrabajo {

    @Autowired
    private iPuestoTrabajoRepo puestoTrabajo;

    @Override
    public List<PuestoTrabajo> obtenerTodosLosPuestosTrabajo() {
        return puestoTrabajo.findAll();
    }

    @Override
    public PuestoTrabajo obtenerPuestoTrabajoPorId(int id) {
        return puestoTrabajo.findById(id).orElse(null);
    }

    @Override
    public PuestoTrabajo crearPuestoTrabajo(PuestoTrabajo nuevoPuesto) {
        return puestoTrabajo.save(nuevoPuesto);
    }

    @Override
    public PuestoTrabajo actualizarPuestoTrabajo(int id, PuestoTrabajo datosActualizados) {
        datosActualizados.setId(id);
        return puestoTrabajo.save(datosActualizados);
    }

    @Override
    public void eliminarPuestoTrabajo(int id) {
        puestoTrabajo.deleteById(id);
    }
}
