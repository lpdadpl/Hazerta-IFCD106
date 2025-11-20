package ejercicios03JavaTime.ejercicio5;

import java.time.LocalDate;

public class CompararFechasFestivas {
    public static void main(String[] args) {
        LocalDate navidad = LocalDate.of(2024, 12, 25);
        LocalDate nocheVieja = LocalDate.of(2024, 12, 31);

        System.out.println("Navidad: " + navidad);
        System.out.println("Nochevieja: " + nocheVieja);

        if (navidad.isBefore(nocheVieja)) {
            System.out.println("Navidad es antes que Nochevieja.");
        }

        if (nocheVieja.isAfter(navidad)) {
            System.out.println("Nochevieja es después de Navidad.");
        }
    }
}