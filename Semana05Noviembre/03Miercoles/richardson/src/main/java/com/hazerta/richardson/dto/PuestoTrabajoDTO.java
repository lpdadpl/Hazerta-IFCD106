package com.hazerta.richardson.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PuestoTrabajoDTO {
    private int id;
    private String nombre;
    private int nivel;
    private double sueldo;

}
