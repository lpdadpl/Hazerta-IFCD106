package ejemplointerface;

public class Avion extends Vehiculo implements ObjetoVolador{

    public Avion() {
    }

    @Override
    public String volar() {
        return "el avion esta volando";
    }

    @Override
    public String despegar() {
        return "El avion esta despegando";
    }

    @Override
    public String aterrizar() {
        return "El avion esta aterrizando";
    }
}
