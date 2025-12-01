package com.hazerta.EjerciciosSpring.ejercicios12_Consultas;

import com.hazerta.EjerciciosSpring.AnotacionesBasicas.Ejercicio1.Modelo.Saludo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
