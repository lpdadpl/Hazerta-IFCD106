package com.hazerta.data.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.Length;

@Entity
@Table(name = "departamentos")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Departamento {
    @Id
    private int idDepartamento;
    @Column(length= 50, nullable = false)
    private String nombre;
    private Integer numEmpleados;

}
