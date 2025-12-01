package ejercicios07Interfaces.ejercicio2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("1234ABC", "Toyota Corolla");
        System.out.println(coche.toString());



        iTaller tallerMecanico = new TallerMecanica();
        seguroCoche seguro1 = new seguroCoche(tallerMecanico, "Mapfre");

        iTaller tallerPintura = new TallerPintura();
        seguroCoche seguro2 = new seguroCoche(tallerPintura, "AXA");

        System.out.println(seguro1.reparar(coche));
        System.out.println(seguro2.reparar(coche));
    }
}