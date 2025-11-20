package com.hazerta.richardson.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "puestos_trabajo")
public class PuestoTrabajo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 60, nullable = false)
    private String nombre;
    private int nivel;
    private double sueldo;

}
