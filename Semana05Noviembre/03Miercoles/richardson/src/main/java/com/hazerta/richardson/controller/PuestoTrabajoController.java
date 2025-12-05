package com.hazerta.richardson.controller;

import com.hazerta.richardson.dto.PuestoTrabajoDTO;
import com.hazerta.richardson.entity.PuestoTrabajo;
import com.hazerta.richardson.exception.NoEncontradoException;
import com.hazerta.richardson.service.PuestoTrabajoServiceImpl;
import com.hazerta.richardson.service.iServicePuestoTrabajo;
import org.hibernate.annotations.DialectOverride;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;


@RestController
@RequestMapping("/api/puestos-trabajo")
@CrossOrigin(origins = "http://localhost:4200")
public class PuestoTrabajoController {


    @Autowired
    private iServicePuestoTrabajo puestoTrabajoService;


    @Autowired
    private ModelMapper mapper;


    @GetMapping
    public ResponseEntity<List<PuestoTrabajoDTO>> obtenerTodosLosPuestosDeTrabajo(){
        List<PuestoTrabajoDTO> puestoTrabajoDTO = puestoTrabajoService.obtenerTodosLosPuestosTrabajo()
                .stream()
                .map(puesto ->mapper.map(puesto, PuestoTrabajoDTO.class))
                .collect(Collectors.toList());

        return new ResponseEntity<>(puestoTrabajoDTO, HttpStatus.OK);

    }

    @GetMapping("{id}")
    public ResponseEntity<PuestoTrabajoDTO> obtenerPuestoTrabajoPorId(@PathVariable int id){

        PuestoTrabajo puestoTrabajo = puestoTrabajoService.obtenerPuestoTrabajoPorId(id);
        if(puestoTrabajo == null){
            throw new NoEncontradoException();
        }
        return new ResponseEntity<>(mapper.map(puestoTrabajo, PuestoTrabajoDTO.class), HttpStatus.OK);

    }

    @GetMapping("/hateos/{id}")
    public EntityModel<PuestoTrabajoDTO> consultarUnoH(@PathVariable int id){
        PuestoTrabajo puestoTrabajo = puestoTrabajoService.obtenerPuestoTrabajoPorId(id);
        if(puestoTrabajo == null){
            throw new NoEncontradoException();
        }
        WebMvcLinkBuilder link1 = linkTo(methodOn(this.getClass()).obtenerPuestoTrabajoPorId(id));
        return EntityModel.of(mapper.map(puestoTrabajo, PuestoTrabajoDTO.class)).add(link1.withRel("puesto_trabajo-link"));
    }


    @PostMapping
    public ResponseEntity<PuestoTrabajoDTO> crearPuestoTrabajo(@RequestBody PuestoTrabajoDTO puestoTrabajoDTO){
        PuestoTrabajo puestoTrabajo = mapper.map(puestoTrabajoDTO, PuestoTrabajo.class);
        PuestoTrabajo puestotrabajoBBDD = puestoTrabajoService.crearPuestoTrabajo(puestoTrabajo);
        return new ResponseEntity<>( mapper.map(puestotrabajoBBDD, PuestoTrabajoDTO.class), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<PuestoTrabajoDTO> modificarPuestoTrabajo(@RequestBody PuestoTrabajoDTO puestoTrabajoDTO){
        PuestoTrabajo puestoTrabajoBBDD = puestoTrabajoService.obtenerPuestoTrabajoPorId(puestoTrabajoDTO.getId());

        if(puestoTrabajoBBDD ==null){
            throw new NoEncontradoException();
        }
        puestoTrabajoBBDD = puestoTrabajoService.actualizarPuestoTrabajo(mapper.map(puestoTrabajoDTO, PuestoTrabajo.class));
        return  new ResponseEntity<>(mapper.map(puestoTrabajoBBDD,PuestoTrabajoDTO.class), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPuestoTrabajo(@PathVariable int id){
        PuestoTrabajo puestoTrabajoBBDD = puestoTrabajoService.obtenerPuestoTrabajoPorId(id);
        if (puestoTrabajoBBDD == null){
            throw new NoEncontradoException();
        }
        puestoTrabajoService.eliminarPuestoTrabajo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
