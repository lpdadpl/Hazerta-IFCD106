package com.hazerta.richardson.controller;

import com.hazerta.richardson.dto.PuestoTrabajoDTO;
import com.hazerta.richardson.entity.PuestoTrabajo;
import com.hazerta.richardson.service.PuestoTrabajoServiceImpl;
import com.hazerta.richardson.service.iServicePuestoTrabajo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/puestos-trabajo")
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
        return new ResponseEntity<>(mapper.map(puestoTrabajo, PuestoTrabajoDTO.class), HttpStatus.OK);

    }


}
