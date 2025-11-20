package ejercicios09InterfacesFuncionalesYStreams.ejercicio4;

import javax.sql.rowset.FilteredRowSet;
import java.util.ArrayList;
import java.util.function.Function;

/// 1. Filtrado de elementos de una lista: Define una función que tome una lista de
/// números como entrada y devuelva una lista que solo contenga los números
/// pares. Utiliza la interfaz funcional Function para filtrar los elementos de la
/// lista. ✅
/// 2. Cálculo de estadísticas:Escribe una función que tome una lista de números
/// como entrada y devuelva un objeto Stats que contenga estadísticas como el
/// mínimo, el máximo, la media de los números en la lista. Utiliza la interfaz
/// funcional Function para realizar los cálculos necesarios.
/// 3. Validación de contraseñas:Crea una función que tome una cadena que
/// representa una contraseña y devuelva true si la contraseña cumple con ciertos
/// criterios de validación, como tener al menos ocho caracteres, incluir al menos
/// una letra mayúscula, una letra minúscula, un número y un carácter especial.
/// Utiliza la interfaz funcional Function para representar cada criterio de
/// validación como una función independiente y combina estas funciones para
/// verificar la contraseña completa.

public class Functions {

    ArrayList<Integer> numerosprueba = new ArrayList<>( 7);
    {
        numerosprueba.add(4);        numerosprueba.add(4);
        numerosprueba.add(4);        numerosprueba.add(4);
        numerosprueba.add(4);        numerosprueba.add(4);
        numerosprueba.add(4);        numerosprueba.add(4);
    }

    private void FiltroPares() {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        Function<ArrayList<Integer>, ArrayList<Integer>> filtroPares = lista -> {
            ArrayList<Integer> pares = new ArrayList<>();
            for (Integer n : lista) {
                if (n % 2 == 0) {
                    pares.add(n);
                }
            }

            return pares;
        };
        ArrayList<Integer> numerosPares = filtroPares.apply(numeros);
        System.out.println("Números pares: " + numerosPares);
    }

    class Stats{
        private int min;
        private int max;
        private double mean;

        public Stats(int min, int max, double mean) {
            this.min = min;
            this.max = max;
            this.mean = mean;
        }
    }
    private void CalculateStatistics() {
        Function<ArrayList<Integer>, Stats> calculateStats = lista -> {
            int max = lista.stream().mapToInt(Integer::intValue).max().getAsInt();
            int min = lista.stream().mapToInt(Integer::intValue).min().getAsInt();
            double mean = lista.stream().mapToInt(Integer::intValue).average().getAsDouble();
            return new Stats(min, max, mean);
        };

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);
        numbers.add(3);

        Stats stats = calculateStats.apply(numbers);
        System.out.println(stats);
    }

    public static void main(String[] args) {
        Functions functions = new Functions();

        functions.FiltroPares();
        functions.CalculateStatistics();
    }
}
