package com.hazerta.jpaconsultas;

import com.hazerta.jpaconsultas.servicios.IServicioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaconsultasApplication implements CommandLineRunner {

    @Autowired
    IServicioProducto servicioProducto;

    public static void main(String[] args) {
		SpringApplication.run(JpaconsultasApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Lista de productos");
        servicioProducto.listarProducto().forEach(System.out::println);
        System.out.println("-- Consulta personalizada por nombre");
        servicioProducto.listarProductosPorNombre("Geitost").forEach(System.out::println);
        System.out.println("-- Consulta filtrada por contenido");
        servicioProducto.listarProductoPorPatron("F").forEach(System.out::println);
        System.out.println("-- Consulta filtrada por categoria");
        servicioProducto.listarProductoPorCategoria(5).forEach(System.out::println);
        System.out.println("-- Consulta filtrada por categoria");
        servicioProducto.obtenerProductoPorPatronsql("F").forEach(System.out::println);
    }
}
