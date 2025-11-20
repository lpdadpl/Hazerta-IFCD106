package ejercicios09InterfacesFuncionalesYStreams.ejercicio2;

import java.util.function.Consumer;

/// 1. Consumidor para imprimir en mayúsculas: Tomar una cadena de texto y
/// mostrarla en mayúsculas. ✅
/// 2. Consumidor para imprimir números y sus cuadrados: Tomar un número
/// entero y mostrarlo junto con su cuadrado. ✅
/// 3. Consumidor para imprimir detalles de un producto: Tomar un objeto Producto
/// y mostrar sus detalles como nombre, precio, etc.

public class Consumidores {

    private void pasarMayus() {
        Consumer<String> cadena = x -> System.out.println(x.toUpperCase());
        String texto = "esto esta escrito en mayusculas";
        cadena.accept(texto);
    }

    private void numerosYCuadrados(){
        Consumer<Integer> numerosYCuadrados  = n -> System.out.println("numero: " + n + " y su cuadrado: " + (n*n));
        Integer numero = 10;
        numerosYCuadrados.accept(numero);

    }

    private void imprimirDetalles(){
        Consumer<Objeto> imprimirDetalles = objeto -> System.out.println("El objeto es: " + objeto.nombre + " tiene el id: " + objeto.id + " cuesta: " +
                +objeto.precio+"€    y se puede definir como: "+objeto.descripcion);
        Objeto objeto = new Objeto(1, "Boligrafo", 1.2, "palo que deja marcas");
        imprimirDetalles.accept(objeto);


    }

    public static void main(String[] args) {

    Consumidores consumidores = new Consumidores();

    consumidores.pasarMayus();
    consumidores.numerosYCuadrados();
    consumidores.imprimirDetalles();

    }
}
