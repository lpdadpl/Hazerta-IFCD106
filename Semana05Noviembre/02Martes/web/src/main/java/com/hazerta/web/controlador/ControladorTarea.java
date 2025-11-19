package com.hazerta.web.controlador;

import com.hazerta.web.dto.TareaDTO;
import com.hazerta.web.modelo.Tarea;
import com.hazerta.web.servicio.IServicioTarea;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tareas")
public class ControladorTarea {
    @Autowired
    private IServicioTarea servicioTarea;

    @Autowired
    private ModelMapper mapper;

    //  SIN DTO, EXPONIENDO EL MODELO
//    @GetMapping
//    public ResponseEntity<List<Tarea>> consultarTodas() {
//        return new ResponseEntity<>(servicioTarea.consultarTodas(), HttpStatus.OK);
//    }
//
//    @GetMapping("/id/{id}")
//    public ResponseEntity<Tarea> obtenerTareaPorId(@PathVariable("id") Long id){
//        return new ResponseEntity<>(servicioTarea.obtenerTareaPorId(id), HttpStatus.OK);
//    }
//
//    @GetMapping("/nombre/{nombre}")
//    public ResponseEntity<List<Tarea>> obtenerTareaPorNombre(@PathVariable("nombre") String nombre){
//        return new ResponseEntity<>(servicioTarea.obtenerTareaPorNombre(nombre), HttpStatus.OK);
//    }
//    @GetMapping("/estado/{estado}")
//    public ResponseEntity<List<Tarea>> obtenerTareaPorEstado(@PathVariable("estado") boolean estado){
//        return new ResponseEntity<>(servicioTarea.obtenerTareaPorEstado(estado), HttpStatus.OK);
//    }



    //  CON DTO, PROTEGIENDO EL MODELO
    @GetMapping
    public List<TareaDTO> consultarTodas() throws Exception {
        List<TareaDTO> listaTareas = servicioTarea.consultarTodas().
                stream().map(x->mapper.map(x, TareaDTO.class)).
                collect(Collectors.toList());
        return listaTareas;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<TareaDTO> obtenerTareaPorId(@PathVariable("id") Long id){
        Tarea tarea = servicioTarea.obtenerTareaPorId(id);
        TareaDTO dto = mapper.map(tarea, TareaDTO.class);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<List<TareaDTO>> obtenerTareaPorNombre(@PathVariable("nombre") String nombre){
        List<TareaDTO> listaDTO = servicioTarea.obtenerTareaPorNombre(nombre)
                .stream()
                .map(t -> mapper.map(t, TareaDTO.class))
                .collect(Collectors.toList());

        return new ResponseEntity<>(listaDTO, HttpStatus.OK);
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<List<TareaDTO>> obtenerTareaPorEstado(@PathVariable("estado") boolean estado){
        List<TareaDTO> listaDTO = servicioTarea.obtenerTareaPorEstado(estado)
                .stream()
                .map(t -> mapper.map(t, TareaDTO.class))
                .collect(Collectors.toList());

        return new ResponseEntity<>(listaDTO, HttpStatus.OK);
    }


}
