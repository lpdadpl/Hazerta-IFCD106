package com.hazerta.EjerciciosSpring.ejercicios12_Consultas.tertiary.entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "lugares")
public class Lugares {

    @Id
    private String idLugar;
    private String nombre;
}
