package ejercicios03JavaTime.ejercicio6;
import java.time.LocalDate;

public class SumarSemanas {
    public static void main(String[] args) {
        LocalDate fechaInicial = LocalDate.of(2024, 3, 15);
        LocalDate fechaResultado = fechaInicial.plusWeeks(35);

        System.out.println("Fecha inicial: " + fechaInicial);
        System.out.println("Fecha después de 35 semanas: " + fechaResultado);
    }
}
