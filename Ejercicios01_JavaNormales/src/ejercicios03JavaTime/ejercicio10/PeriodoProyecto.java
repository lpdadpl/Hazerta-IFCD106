package ejercicios03JavaTime.ejercicio10;

import java.time.LocalDate;
import java.time.Period;

public class PeriodoProyecto {
    public static void main(String[] args) {
        LocalDate inicio = LocalDate.of(2024, 3, 15);
        LocalDate fin = LocalDate.of(2024, 10, 20);

        Period periodo = Period.between(inicio, fin);

        System.out.println("Duración del proyecto:");
        System.out.println(periodo.getMonths() + " meses y " + periodo.getDays() + " días");
    }
}
