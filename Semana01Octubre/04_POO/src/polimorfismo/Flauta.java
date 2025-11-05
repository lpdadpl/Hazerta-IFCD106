package polimorfismo;

public class Flauta extends InstrumentoMusical{

    protected String material;

    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String emitirSonido(){
        return "Sonido d flauta";
    }
}
