package ejercicios03JavaTime.ejercicio8;

import java.time.LocalDate;
import java.time.Period;

public class CalcularEdad {
    public static void main(String[] args) {
        LocalDate fechaNacimiento = LocalDate.of(2007, 8, 7);
        LocalDate fechaActual = LocalDate.now();

        Period edad = Period.between(fechaNacimiento, fechaActual);

        System.out.println("Edad: " + edad.getYears() + " años");
    }
}
