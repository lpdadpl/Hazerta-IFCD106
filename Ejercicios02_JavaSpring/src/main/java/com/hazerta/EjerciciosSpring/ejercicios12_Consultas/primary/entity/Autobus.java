package com.hazerta.EjerciciosSpring.ejercicios12_Consultas.primary.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "autobuses")
@Entity
public class Autobus {

    @Id
    private String matricula;
    private int aFabricacion;

}
