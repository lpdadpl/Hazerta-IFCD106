package ejercicios09InterfacesFuncionalesYStreams.ejercicio1;

import java.util.function.Predicate;

/// 1. Predicado para números positivos: Verificar si un número entero es positivo. ✅
/// 2. Predicado para cadenas no vacías: Comprobar si una cadena de texto no está
/// vacía. ✅
/// 3. Predicado para números pares: Determinar si un número entero es par. ✅
/// 4. Predicado para números mayores que un valor dado. Comprobar si un número
/// entero es mayor que un valor específico ✅

public class Predicados {

    private void esPositivo(){
        Predicate<Integer> esPositivo = x -> x > 0;
        int n = 5;
        boolean result= esPositivo.test(n);
        System.out.println(result);

    }

    private void cadenaVacia(){
        Predicate<String> estaVacia = s -> s.length() < 0;
        String cadena = "hola mundo de java";
        boolean result = estaVacia.test(cadena);
        System.out.println(result);
    }

    private void esPar(){
        Predicate<Integer> esPar = n -> n%2 == 0;
        int num = 4;
        boolean result = esPar.test(num);
        System.out.println(result);
    }

    private void esMayor(){
        Predicate<Integer> esMayor = n -> n >10;
        int num = 5;
        boolean result = esMayor.test(num);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Predicados predicados = new Predicados();

        System.out.println("Es el numero positivo?");
        predicados.esPositivo();
        System.out.println("Esta la cadena de texto anterior vacia?");
        predicados.cadenaVacia();
        System.out.println("Es el numero introducido par?");
        predicados.esPar();
        System.out.println("Es el numero introducido mayor que 10?");
        predicados.esMayor();

    }

}
