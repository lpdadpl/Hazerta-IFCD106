package com.hazerta.modelo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@Setter
@Getter
public class Producto {
    @ToString.Include
    private int id;
    private String nombre;
}
