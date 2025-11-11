package com.hazerta.data.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DetalleOrdenes {

    @Id
    private int idOrden;

    private int idProducto;
    private int cantidad;
    private double precio;


}
