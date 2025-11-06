package com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio3Application implements CommandLineRunner {

	@Value("${app.message}")
	private String message;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Ejercicio3Application.class);
		Map<String, Object> defaults = new HashMap<>();
		defaults.put("spring.config.name", "configpersonalizada");
		app.setDefaultProperties(defaults);
		app.run(args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Mensaje desde propiedades personalizadas: " + message);
	}
}


