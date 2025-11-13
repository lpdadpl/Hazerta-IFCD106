package com.hazerta.jpaconsultas.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Producto {
    @Id
    @Column(name="product_id")
    private int idProducto;
    @Column(name = "product_name")
    private String nombre;
    @Column(name = "category")
    private int category_id;

}
