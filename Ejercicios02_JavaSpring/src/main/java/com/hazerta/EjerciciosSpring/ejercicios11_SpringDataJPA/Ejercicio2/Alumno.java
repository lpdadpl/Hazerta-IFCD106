package com.hazerta.EjerciciosSpring.SpringDataJPA.Ejercicio2;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "alumnos")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Alumno {
    @Id
    @Column(length = 50, name = "id")
    private int idAlumno;
    private String nombre;
    private String direccion;


    @ManyToMany
    @JoinColumn(name = "id_alumno", foreignKey = @ForeignKey(name="FK_ALUMNO"), referencedColumnName = "idAlumno")
    private List<Curso> cursos;

}

