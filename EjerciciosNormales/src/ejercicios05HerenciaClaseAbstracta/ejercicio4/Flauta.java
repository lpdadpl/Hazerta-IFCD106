package ejercicios05HerenciaClaseAbstracta.ejercicio4;

public class Flauta extends InstrumentoMusical {

    private String material;

    public Flauta() {
    }

    public Flauta(String marca, String material) {
        super(marca);
        material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        material = material;
    }

    @Override
    public String emitirSonido(){
        return "sonido flauta";
    }
}
