package com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio2Application implements CommandLineRunner {

	@Autowired
	private AppMetadata appMetadata;

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println(appMetadata.getCreatedByMessage());
	}
}


