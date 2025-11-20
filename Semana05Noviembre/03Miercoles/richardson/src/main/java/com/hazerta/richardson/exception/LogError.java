package com.hazerta.richardson.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LogError {

    private LocalDateTime fecha;
    private  String mensaje;
    private String detalle;
}
