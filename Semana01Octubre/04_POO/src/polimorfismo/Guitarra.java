package polimorfismo;

public class Guitarra extends InstrumentoMusical{

    protected int noCuerdas;

    public Guitarra() {
    }

    public Guitarra(String marca, int noCuerdas) {
        super(marca);
        this.noCuerdas = noCuerdas;
    }

    public int getNoCuerdas() {
        return noCuerdas;
    }

    public void setNoCuerdas(int noCuerdas) {
        this.noCuerdas = noCuerdas;
    }

    @Override
    public String emitirSonido(){
        return "sonido de guitarra";
    }
}
