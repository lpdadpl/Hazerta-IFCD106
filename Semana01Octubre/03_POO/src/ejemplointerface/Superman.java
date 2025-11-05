package ejemplointerface;

public class Superman implements ObjetoVolador{
    @Override
    public String volar() {
        return "Superman esta volando";
    }

    @Override
    public String despegar() {
        return "Superman esta despegando";
    }

    @Override
    public String aterrizar() {
        return "Superman esta aterrizando";
    }
}
