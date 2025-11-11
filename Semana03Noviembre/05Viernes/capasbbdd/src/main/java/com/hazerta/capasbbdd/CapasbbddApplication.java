package com.hazerta.capasbbdd;

import com.hazerta.capasbbdd.servicio.ServicioProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CapasbbddApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CapasbbddApplication.class, args);
	}

    @Autowired
    private ServicioProductos servicioProductos;


    @Override
    public void run(String... args) throws Exception {

        System.out.println(servicioProductos.obtenerTodos());
    }
}
