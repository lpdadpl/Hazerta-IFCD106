package ejercicios03JavaTime.ejercicio2;

import java.time.LocalDate;

public class DeclararFechaHoy {
    public static void main(String[] args) {
            LocalDate date = LocalDate.now();

            System.out.println("hoy es: "+date);

    }
}
