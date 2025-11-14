package com.hazerta.Ejercicios;

import com.hazerta.Ejercicios.servicio.IServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class EjerciciosApplication implements CommandLineRunner {

    @Autowired
    IServicioCliente servicioCliente;

    List<String> paises = List.of(
            "USA",
            "UK",
            "Germany",
            "France",
            "Brazil"
    );

    public static void main(String[] args) {
		SpringApplication.run(EjerciciosApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("0. Listar todos los clientes");
        servicioCliente.listarClientes();
        System.out.println("1. Obtener todos los clientes de una ciudad concreta. \n");
        servicioCliente.listarClientePorCiudad("México D.F.").forEach(System.out::println);
        System.out.println("2. Buscar clientes que pertenezcan simultáneamente a una ciudad y un país \n" +
                "determinados. ");
        servicioCliente.listarClienteEmpresa("Yang Wang").forEach(System.out::println);
        System.out.println("3. Recuperar los tres primeros clientes cuyo nombre de empresa coincida con un \n" +
                "patrón dado mediante LIKE. ");
        servicioCliente.listarClienteEmpresa("Yang Wang").forEach(System.out::println);
        System.out.println("4. Obtener todas las combinaciones distintas de ciudad para un país concreto, \n" +
                "representadas en una proyección CiudadPais. ");
        servicioCliente.listarCiudadesPorPais("UK").forEach(System.out::println);
        System.out.println("5. Listar todos los clientes ordenados descendentemente por el nombre de la \n" +
                "empresa. ");
        servicioCliente.listarClientesPorEmpresaDesc("Philip Cramer").forEach(System.out::println);
        System.out.println("6. Consultar clientes cuyo país esté incluido dentro de una lista de países. ");
        servicioCliente.listarClientePorListaPaises(paises).forEach(System.out::println);
        System.out.println();
        System.out.println();
    }
}
