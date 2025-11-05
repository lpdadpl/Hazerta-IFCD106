package hazerta.com.presentacion;

import hazerta.com.modelo.Producto;

import java.util.*;

public class Inicio {
    public static void main(String[] args) {
        //Explicacion de paquete java.util.collections

        List lista = new ArrayList<>();
        lista.add("Hola");
        lista.add(123);
        lista.add(45.67);
        lista.add(new Producto(1, "Alcachofa"));

        System.out.println("Impresion de List ArrayList");
        System.out.println(lista);
        System.out.println("Impresion del tamañp del ArrayList");
        System.out.println(lista.size());
        System.out.println("Impresion de al tercera posicion de List ArrayList");
        System.out.println(lista.get(2));
        //Anadir un nuevo elemento a la lista
        lista.add("");
        //Modifiar un elemento de la lista
        lista.set(4, "Hola Coders");

        System.out.println(lista);


        //Lista generica de String
        List<String> ListaString = new ArrayList<>();
        ListaString.add("Hola");
        //Esto de a continuacion daria error
        //ListaString.add(123);
        System.out.println("Impresion de List<> Arraylist");
        System.out.println(ListaString);

        //Ejemplo de Set - HashSet
        Set conjunto = new HashSet();
        conjunto.add("Hola");
        conjunto.add(123);
        conjunto.add(45.67);
        conjunto.add(new Producto(2, "Berberechos"));
        conjunto.add("Hola");
        System.out.println("Impresion de HashSet");
        System.out.println(conjunto);

        Set<Integer> conjuntoEnteros = new HashSet<>();
        conjuntoEnteros.add(100);
        conjuntoEnteros.add(200);
        //Esto de a continuacion daria error
        //ConjuntosEnteros.add("Hola");
        System.out.println(conjuntoEnteros);


        Map<String, String> mapa = new HashMap<>();
        mapa.put("123456789A", "juan juanez");
        mapa.put("123456789B", "paco paquez");
        System.out.println(mapa);

        System.out.println(mapa.get("123456789A"));
    }
}
