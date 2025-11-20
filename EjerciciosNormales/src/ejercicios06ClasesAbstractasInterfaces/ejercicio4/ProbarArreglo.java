package ejercicios06ClasesAbstractasInterfaces.ejercicio4;

import ejercicios06ClasesAbstractasInterfaces.ejercicio4.implementacion.TallerMecanica;
import ejercicios06ClasesAbstractasInterfaces.ejercicio4.implementacion.TallerPintura;
import ejercicios06ClasesAbstractasInterfaces.ejercicio4.interfaz.iTaller;
import ejercicios06ClasesAbstractasInterfaces.ejercicio4.modelo.Coche;
import ejercicios06ClasesAbstractasInterfaces.ejercicio4.modelo.SeguroCoche;

public class ProbarArreglo {
    public static void main(String[] args) {
        Coche coche = new Coche();
        SeguroCoche sc= new SeguroCoche();
        TallerPintura tp = new TallerPintura();
        TallerMecanica tm = new TallerMecanica();
        iTaller tp2 = new TallerPintura();
        iTaller tm2 = new TallerMecanica();

        tp.repararCoche();
        tp2.repararCoche();
        tm.repararCoche();
        tm2.repararCoche();


        System.out.println("hola");
    }
}
