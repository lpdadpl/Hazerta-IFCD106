package com.hazerta.EjerciciosSpring.ejercicios12_Consultas.secondary.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "conductores")
@Entity
public class Conductores {

    @Id
    private String dni;
    private String nombre;
}
