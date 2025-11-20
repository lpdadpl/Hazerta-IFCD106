package ejercicios09InterfacesFuncionalesYStreams.ejercicio3;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

/// 1. Proveedor de números aleatorios: Generar un número aleatorio en el rango
/// especificado. ✅
/// 2. Proveedor de una lista predefinida. Devolver una lista predefinida de
/// elementos. ✅
/// 3. Proveedor de fecha y hora actual: Obtener la fecha y hora actual del sistema. ✅
/// 4. Proveedor de un nuevo objeto String vacío: Crear y devolver una cadena de
/// texto vacía. ✅

public class Proveedores {


    private void randomNumber(){
        Supplier<Integer> randomNumber = () -> (int)(Math.random()*100)+1;
        System.out.println(randomNumber.get());
    }

    private void predefinedList(){
        Supplier<ArrayList<String>> predefinedList = () -> new ArrayList<>(Arrays.asList("Pajaro", "Perro", "Gato", "Pez"));
        System.out.println(predefinedList.get());
    }

    private void CurrentLocalDateTime(){
        Supplier<LocalDateTime> currentLocalDateTime = () -> LocalDateTime.now();
        System.out.println("Ahora mismo estamos a fecha y hora:  "+currentLocalDateTime.get());
        System.out.println(currentLocalDateTime.get());
    }

    private void EmptyString(){
        Supplier<String> emptyString = ()-> (String)(" ");
        System.out.println("la cadena de texto esta vacia como se muestra a continuacion:");
        System.out.println(emptyString.get());
        System.out.println("Ves? vacia");

    }

    public static void main(String[] args) {
        Proveedores proveedores = new Proveedores();

        proveedores.randomNumber();

        proveedores.predefinedList();

        proveedores.CurrentLocalDateTime();

        proveedores.EmptyString();
    }

}
