package ejercicios08Colecciones.ejercicio4.presentacion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<String, Integer>();
        notas.put("Alberto de Pablo", 8);
        notas.put("Pablo de Alberto", 7);
        notas.put("Carmen de Pablo", 6);
        notas.put("Pablo de Carmen", 5);

        //System.out.println(notas);

        Scanner sc= new Scanner(System.in);
        System.out.println("elija de que alumno quiere saber la nota");
        System.out.println("1 -Alberto de Pablo");
        System.out.println("2- Pablo de Alberto");
        System.out.println("3- Carmen de Pablo");
        System.out.println("4- Pablo de Carmen");

        int eleccion = sc.nextInt();

        switch (eleccion) {

            case 1 -> {
                System.out.println(notas.get("Alberto de Pablo"));
            }
            case 2 -> {
                System.out.println(notas.get("Pablo de Alberto"));
            }
            case 3 -> {
                System.out.println("Carmen de Pablo ha sacado un: "+notas.get("Carmen de Pablo"));
            }
            case 4 -> {
                System.out.println(notas.get("Pablo de Carmen"));
            }
            default -> {
                System.out.println();
            }
        }
    }
}
