package ejercicios06ClasesAbstractasInterfaces.ejercicio1.interfaz;

import ejercicios06ClasesAbstractasInterfaces.ejercicio1.implementacion.Pajaro;

public class ProbarAnimal {
    public static void main(String[] args) {
        Pajaro piopio = new Pajaro();

        System.out.println(piopio.moverse());
        piopio.comer();

    }
}
