package ejercicios08Colecciones.ejercicio1.presentacion;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<String> conjunto = new HashSet<>();
        conjunto.add("1a cadena de texto");
        conjunto.add("2a cadena de texto");
        conjunto.add("3a cadena de texto");
        conjunto.add("4a cadena de texto");
        conjunto.add("5a cadena de texto");

        System.out.println(conjunto);


    }
}
