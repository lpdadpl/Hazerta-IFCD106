package ejercicios02String.ejercicio6;

import java.util.Scanner;

public class CadenaDeTextoCabeza {
    public static void main(String[] args) {
        String cadenaDeTexto = "Nunca mAtes una Mosca Sobre la cabeza de un tigre.";
        Scanner sc = new Scanner(System.in);
        System.out.println("elija su opcion");
        System.out.println("1 - split de la cadena de texto");
        System.out.println("2 - regex");
        int eleccion = sc.nextInt();
        switch (eleccion) {
            case 1:
                String[] palabras = cadenaDeTexto.split(" ");
                System.out.println(palabras[6]);
                break;

            case 2:
                String primeraPalabra = cadenaDeTexto.strip().split("\\s+")[6];
                System.out.println(primeraPalabra);
                break;
        }
    }
}
