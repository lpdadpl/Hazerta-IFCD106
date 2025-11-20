package ejercicios03JavaTime.ejercicio7;

import java.time.LocalDate;
import java.time.Period;

public class CalcularAniosTrabajados {
    public static void main(String[] args) {
        LocalDate fechaInicio = LocalDate.of(2012, 7, 6);
        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(fechaInicio, fechaActual);
        int aniosTrabajados = periodo.getYears();

        System.out.println("Años trabajados desde el 6 de julio de 2012: " + aniosTrabajados);
    }
}
