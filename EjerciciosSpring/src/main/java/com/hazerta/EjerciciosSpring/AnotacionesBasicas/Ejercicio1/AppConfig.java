package com.hazerta.EjerciciosSpring.AnotacionesBasicas.Ejercicio1;

import com.hazerta.EjerciciosSpring.AnotacionesBasicas.Ejercicio1.Modelo.Saludo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean
    public Saludo saludo() {
        return new Saludo("Bienvenido a Spring");
    }
}
