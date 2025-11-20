package ejercicios03JavaTime.ejercicio3;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DeclararFechaHoySidney {
    public static void main(String[] args) {
        ZoneId zonaSidney = ZoneId.of("Australia/Sydney");
        LocalDate fechaHoySidney = ZonedDateTime.now(zonaSidney).toLocalDate();

        System.out.println("Hoy en Sídney es: " + fechaHoySidney);
    }

}
