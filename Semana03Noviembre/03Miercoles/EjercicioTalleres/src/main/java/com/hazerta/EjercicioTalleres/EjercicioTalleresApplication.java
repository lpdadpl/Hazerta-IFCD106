package com.hazerta.EjercicioTalleres;

import com.hazerta.EjercicioTalleres.modelo.Coche;
import com.hazerta.EjercicioTalleres.modelo.SeguroCoche;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioTalleresApplication implements CommandLineRunner {

    @Autowired
    private Coche c1;
    @Autowired
    private SeguroCoche sc;


    public static void main(String[] args) {
		SpringApplication.run(EjercicioTalleresApplication.class, args);
	}


    @Override
    public void run(String... args) throws Exception {
        c1.setModelo("Ford Fiesta");
        c1.setMatricula("1234 ABC");
        sc.setAseguradora("Mapfre");
        System.out.println(sc.reparar());
    }
}
