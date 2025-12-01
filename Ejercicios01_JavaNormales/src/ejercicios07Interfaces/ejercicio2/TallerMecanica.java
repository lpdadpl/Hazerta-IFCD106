package ejercicios07Interfaces.ejercicio2;

public class TallerMecanica implements iTaller{

    @Override
    public String reparar(Coche coche) {
        return "Reparacion Mecanica";
    }
}
