package com.hazerta.EjerciciosSpring.AnotacionesBasicas.Ejercicio1;

import com.hazerta.EjerciciosSpring.AnotacionesBasicas.Ejercicio1.Modelo.Saludo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Saludo saludo = context.getBean(Saludo.class);

        System.out.println(saludo.getMensaje());
    }
}
