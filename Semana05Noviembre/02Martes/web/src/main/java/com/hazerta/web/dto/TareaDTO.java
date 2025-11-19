package com.hazerta.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TareaDTO{
    private Long id;
    private String titulo;
    private boolean completada;
}
