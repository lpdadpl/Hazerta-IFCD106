package com.hazerta.EjerciciosSpring;

import com.hazerta.EjerciciosSpring.AnotacionesBasicas.Ejercicio1.Modelo.Saludo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EjerciciosSpringApplication implements CommandLineRunner {

	private Saludo saludo;

	public static void main(String[] args) {
		SpringApplication.run(EjerciciosSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
