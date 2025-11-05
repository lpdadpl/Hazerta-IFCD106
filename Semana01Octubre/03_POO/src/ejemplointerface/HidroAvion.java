package ejemplointerface;

public class HidroAvion extends Vehiculo implements Nautico, ObjetoVolador {

    public HidroAvion() {
    }



    @Override
    public String atracar() {
        return "Hidroavion atracado";
    }

    @Override
    public String navegar() {
        return "Hidroavion navegando";
    }

    @Override
    public String volar() {
        return "Hidroavion volando";
    }

    @Override
    public String despegar() {
        return "Hidroavion depegando";
    }

    @Override
    public String aterrizar() {
        return "Hidroavion aterrizando";
    }
}
