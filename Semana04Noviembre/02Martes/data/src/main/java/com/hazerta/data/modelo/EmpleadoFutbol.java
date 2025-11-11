package com.hazerta.data.modelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Length;
import org.hibernate.annotations.Collate;

import javax.naming.Name;

@Entity
@Table(name = "empleados_futbol")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmpleadoFutbol {

    @Id
    private int idEmpleado;
    @Column(length=60, nullable = false)
    private String nombre;
    @Column(length=60, nullable = false)
    private String posicion;
    private boolean equipacion;

    @OneToOne
    @JoinColumn(name = "id_empleado", nullable = false, foreignKey = @ForeignKey(name = "FK_EmpleadosFutbol_Empleados"), referencedColumnName = "idEmpleado")
    private Empleado empleado;
}
