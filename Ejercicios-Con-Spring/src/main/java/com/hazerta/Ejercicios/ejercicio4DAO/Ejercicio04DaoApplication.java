package com.hazerta.Ejercicios.ejercicio4DAO;

import com.hazerta.Ejercicios.ejercicio4DAO.modelo.AccesoDesarrollo;
import com.hazerta.Ejercicios.ejercicio4DAO.modelo.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio04DaoApplication implements CommandLineRunner {

    @Autowired
    ClienteDao cd1;

    @Autowired
    AccesoDesarrollo ad1;


	public static void main(String[] args) {
		SpringApplication.run(Ejercicio04DaoApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        cd1.setNIF("12345678c");
        cd1.setNombre("Pedro");
        System.out.println(cd1.getNombre() + " tiene acceso a " +ad1.insertar(cd1));
    }
}
