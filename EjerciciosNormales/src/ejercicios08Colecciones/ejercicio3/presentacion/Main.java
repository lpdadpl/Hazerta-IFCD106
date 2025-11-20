package ejercicios08Colecciones.ejercicio3.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i + 1);
            System.out.println("el puesto numero "+ i + " del array lo ocupa el numero: " +(i+1) + " tambien llamado "+ numeros.get(i));
        }
        Stream<Integer> numerosStream = numeros.stream();
        numerosStream.forEach(System.out::println);

    }
}
