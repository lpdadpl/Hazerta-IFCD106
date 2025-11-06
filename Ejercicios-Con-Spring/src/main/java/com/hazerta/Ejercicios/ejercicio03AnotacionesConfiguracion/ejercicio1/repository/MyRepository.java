package com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio1.repository;


import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	public void query() {
		System.out.println("Consulta ejecutada correctamente.");
	}
}
