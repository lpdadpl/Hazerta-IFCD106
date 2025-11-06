package com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Le dice a Spring que esta clase contiene configuración
@ComponentScan(basePackages = {
        "com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio1"
})
public class AppConfig {


}
