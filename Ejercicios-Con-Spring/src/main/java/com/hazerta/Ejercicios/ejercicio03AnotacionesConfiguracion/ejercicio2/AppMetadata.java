package com.hazerta.Ejercicios.ejercicio03AnotacionesConfiguracion.ejercicio2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppMetadata {

	@Value("${app.author}")
	private String authorName;

	@Value("${app.year}")
	private int creationYear;

	public String getCreatedByMessage() {
		return "Aplicación creada por " + authorName + " en " + creationYear;
	}
}


