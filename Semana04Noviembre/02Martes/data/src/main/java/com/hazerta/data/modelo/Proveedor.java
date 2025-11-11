package com.hazerta.data.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Length;

import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "proveedores")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Proveedor {

    @Id
    private int idProveedor;
    @Column(length= 60, nullable = false)
    private String nombre;
    @Column(length= 60, nullable = false)
    private String telefono;
    @Column(length= 60, nullable = false)
    private String direccion;

    @ManyToMany
    @JoinTable(
            name = "proveedor_producto",
            joinColumns = @JoinColumn(name = "id_proveedor", foreignKey = @ForeignKey(name = "FK_Proveedor_Producto_Proveedor"), referencedColumnName = "idProveedor"),
            inverseJoinColumns = @JoinColumn(name = "id_Producto", foreignKey = @ForeignKey(name = "FK_Proveedor_Producto_Producto"), referencedColumnName = "idProducto")
    )
    private List<Producto> productos;
}





