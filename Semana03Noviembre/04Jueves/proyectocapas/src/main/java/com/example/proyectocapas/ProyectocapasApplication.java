package com.example.proyectocapas;

import com.example.proyectocapas.persistencia.AccesoTareas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ProyectocapasApplication implements CommandLineRunner {


    @Autowired
    private AccesoTareas accesoTareas;

	public static void main(String[] args) {
		SpringApplication.run(ProyectocapasApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

        System.out.println("------------------");
        System.out.println(accesoTareas.obtenerTodasLasTareas());
        System.out.println("------------------");
        System.out.println(accesoTareas.obtenerTarea(1));
    }
}
