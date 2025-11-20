package ejercicios05HerenciaClaseAbstracta.ejercicio1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Producto normal
        Producto productoNormal = new Producto("Cuchara", 10, 2.5);
        System.out.println("Producto normal:");
        System.out.println(productoNormal);
        System.out.println("Cantidad a pagar: " + productoNormal.cantidadAPagar() + "€");
        System.out.println();

        // Producto perecedero
        LocalDate fechaFabricacion = LocalDate.of(2025, 10, 20);
        LocalDate fechaCaducidad = LocalDate.of(2025, 11, 5);
        ProductoPerecedero leche = new ProductoPerecedero("Leche", 5, 1.2, fechaFabricacion, fechaCaducidad);
        System.out.println(leche.getFCaducidad());
        System.out.println("Producto perecedero:");
        System.out.println(leche);
        System.out.println("Cantidad a pagar: " + leche.cantidadAPagar() + "€");
        System.out.println("Días hasta caducidad: " + leche.tiempoConsumicion());

        LocalDate fFab = LocalDate.of(2025, 9, 5);
        LocalDate fCad = LocalDate.of(2025, 11, 5);
        ProductoPerecedero pp2 = new ProductoPerecedero("Producto", 5, 34, fFab, fCad);
        System.out.println(pp2.tiempoFabricacion());


        LocalDate FechaFabricacionpp3 = LocalDate.of(2025, 11, 05);
        LocalDate FechaCaducidadpp3 = LocalDate.of(2025, 11, 06);

        ProductoPerecedero pp3 = new ProductoPerecedero("Producto",5, 34, FechaFabricacionpp3, FechaCaducidadpp3);
        System.out.println("Dias desde la fabricacion: " +pp2.tiempoFabricacion());
        System.out.println("Dias desde la fabricacion del tercer producto: "+ pp3.tiempoFabricacion());
    }
}
