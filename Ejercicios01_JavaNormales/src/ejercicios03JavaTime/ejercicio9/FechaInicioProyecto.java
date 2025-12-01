package ejercicios03JavaTime.ejercicio9;

import java.time.LocalDate;

public class FechaInicioProyecto {
    public static void main(String[] args) {
        LocalDate fechaEntrega = LocalDate.of(2024, 10, 2);
        LocalDate fechaInicio = fechaEntrega.minusDays(200);

        System.out.println("Fecha de entrega: " + fechaEntrega);
        System.out.println("Fecha de inicio del proyecto: " + fechaInicio);
    }
}
