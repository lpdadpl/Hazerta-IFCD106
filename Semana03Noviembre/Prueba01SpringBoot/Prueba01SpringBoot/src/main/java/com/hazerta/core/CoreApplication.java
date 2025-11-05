package com.hazerta.core;

import com.hazerta.core.modelo.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication implements CommandLineRunner {

    @Autowired
    private Conductor c1;


	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola mundo");
        System.out.println(c1.conducir());
    }
}
