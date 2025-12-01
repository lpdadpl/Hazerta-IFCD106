package ejercicios08Colecciones.ejercicio2.presentacion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    //Cree un objeto de la clase ArrayList, añada una lista de cadenas y conviértalo a un
    //Stream
    public static void main(String[] args) {
        List<String> conjunto = new ArrayList<>();
        conjunto.add("1a cadena de texto");
        conjunto.add("2a cadena de texto");
        conjunto.add("3a cadena de texto");
        conjunto.add("4a cadena de texto");
        conjunto.add("5a cadena de texto");

        Stream<String> conjuntoStream = conjunto.stream();
        conjuntoStream.forEach(System.out::println);


    }
}
