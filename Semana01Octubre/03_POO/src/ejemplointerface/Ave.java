package ejemplointerface;

public class Ave extends Animal implements ObjetoVolador{

    @Override
    public String volar() {
        return "El ave esta volando";
    }

    @Override
    public String despegar() {
        return "El ave esta despegando";
    }

    @Override
    public String aterrizar() {
        return "El ave esta aterrizando";
    }
}
