package com.hazerta.EjerciciosSpring.SpringDataJPA.Ejercicio2;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name = "cursos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Curso {

    @Id
    private int idCurso;
    private String nombre;
    private int creditos;

    @ManyToMany
    @JoinColumn(name = "id_curso", foreignKey = @ForeignKey(name="FK_CURSO"), referencedColumnName = "idCurso")
    private List<Alumno> alumno;
}
