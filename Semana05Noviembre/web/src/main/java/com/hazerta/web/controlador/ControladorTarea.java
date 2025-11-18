package com.hazerta.web.controlador;

import com.hazerta.web.modelo.Tarea;
import com.hazerta.web.servicio.IServicioTarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class ControladorTarea {
    @Autowired
    private IServicioTarea servicioTarea;


    @GetMapping
    public ResponseEntity<List<Tarea>> consultarTodas() {
        return new ResponseEntity<>(servicioTarea.consultarTodas(), HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Tarea> obtenerTareaPorId(@PathVariable("id") Long id){
        return new ResponseEntity<>(servicioTarea.obtenerTareaPorId(id), HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<List<Tarea>> obtenerTareaPorNombre(@PathVariable("nombre") String nombre){
        return new ResponseEntity<>(servicioTarea.obtenerTareaPorNombre(nombre), HttpStatus.OK);
    }


}
