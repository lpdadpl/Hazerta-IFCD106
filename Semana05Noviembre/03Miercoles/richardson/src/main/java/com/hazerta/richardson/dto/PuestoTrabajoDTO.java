package com.hazerta.richardson.dto;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PuestoTrabajoDTO {
    private int id;
    @NotBlank
    @Size(min = 3, max = 60)
    private String nombre;
    @NotNull
    private Integer nivel;
    private double sueldo;

}
