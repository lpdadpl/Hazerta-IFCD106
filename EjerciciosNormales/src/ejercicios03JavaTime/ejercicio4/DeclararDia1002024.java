package ejercicios03JavaTime.ejercicio4;

import java.time.LocalDate;

public class DeclararDia1002024 {
    public static void main(String[] args) {
        LocalDate dia100 = LocalDate.ofYearDay(2024, 100);
        System.out.println("El día 100 de 2024 es: " + dia100);
    }

}
