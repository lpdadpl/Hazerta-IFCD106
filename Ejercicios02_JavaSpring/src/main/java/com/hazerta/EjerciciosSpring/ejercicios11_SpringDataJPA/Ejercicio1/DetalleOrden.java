package com.hazerta.EjerciciosSpring.SpringDataJPA.Ejercicio1;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "detalle_ordenes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DetalleOrden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID único para cada detalle

    private int idProducto;
    private int cantidad;
    private double precio;

    @ManyToOne
    @JoinColumn(name="id_orden", foreignKey = @ForeignKey(name = "FK_DETALLE_ORDENES"),referencedColumnName = "idOrden")
    private Orden orden;

}
