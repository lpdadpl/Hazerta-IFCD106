package ejercicios04PropuestosClase.ejercicio6;

public class Main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno("Juan García", 3);

        alumno1.setParcial(0, 7.5);
        alumno1.setParcial(1, 8.0);
        alumno1.setParcial(2, 9.2);

        alumno1.mostrarResultadoFinal();
    }
}
