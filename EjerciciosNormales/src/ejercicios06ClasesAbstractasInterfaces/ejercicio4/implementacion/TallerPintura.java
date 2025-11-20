package ejercicios06ClasesAbstractasInterfaces.ejercicio4.implementacion;

import ejercicios06ClasesAbstractasInterfaces.ejercicio4.interfaz.iTaller;

public class TallerPintura implements iTaller {
    @Override
    public String repararCoche() {
        return "Coche pintado";
    }
}
