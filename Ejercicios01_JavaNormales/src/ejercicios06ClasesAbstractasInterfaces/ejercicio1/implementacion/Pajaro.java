package ejercicios06ClasesAbstractasInterfaces.ejercicio1.implementacion;

import ejercicios06ClasesAbstractasInterfaces.ejercicio1.modelo.Animal;

public class Pajaro extends Animal {
    @Override
    public void comer() {
        System.out.println("comidita de pajaro");
        return;
    }

    @Override
    public String moverse() {
        return "pisaditas de pajaro";
    }
}
