package ejercicios06ClasesAbstractasInterfaces.ejercicio1.implementacion;

import ejercicios06ClasesAbstractasInterfaces.ejercicio1.modelo.Animal;

public class Pez extends Animal {
    @Override
    public void comer() {

    }

    @Override
    public String moverse() {
        return "natacion";
    }
}
