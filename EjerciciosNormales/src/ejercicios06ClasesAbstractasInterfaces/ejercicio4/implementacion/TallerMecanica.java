package ejercicios06ClasesAbstractasInterfaces.ejercicio4.implementacion;

import ejercicios06ClasesAbstractasInterfaces.ejercicio4.interfaz.iTaller;

public class TallerMecanica implements iTaller {

    @Override
    public String toString() {
        return "TallerMecaninca{}";
    }

    public TallerMecanica() {
    }

    @Override
    public String repararCoche() {
        return "Motor arreglado";
    }
}
