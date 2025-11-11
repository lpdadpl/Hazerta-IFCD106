package com.hazerta.data.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Ordenes {
    @Id
    private int idOrden;
    @Column(length = 60, nullable = false)
    private LocalDate fechaEntrega;
    private String direccionEntrega;


}
