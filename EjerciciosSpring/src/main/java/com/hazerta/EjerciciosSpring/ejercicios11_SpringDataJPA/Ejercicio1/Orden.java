package com.hazerta.EjerciciosSpring.SpringDataJPA.Ejercicio1;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Table(name = "ordenes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orden {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(length = 5, name = "id")
    private int idOrden;
    private LocalDate fechaEntrega;
    private String direccionEntrega;

}

