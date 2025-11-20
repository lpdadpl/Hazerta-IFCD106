package ejercicios03JavaTime.ejercicio1;

import java.time.LocalDate;

public class FechaInicioyFechaMas10 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 10, 20);
        LocalDate date2 = date.plusDays(10);

        System.out.println("hoy es: "+date);
        System.out.println("dentro de diez dias sera: "+date2);
    }
}
