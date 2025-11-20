package ejercicios02String.ejercicio7;

public class CadenaDeTextoPosicionM {
    public static void main(String[] args) {
        String cadenaDeTexto = "Nunca mates una mosca sobre la cabeza de un tigre.";
        int posicion = cadenaDeTexto.indexOf('m');

        System.out.println("La posición de la primera 'm' es: " + posicion);
    }
}