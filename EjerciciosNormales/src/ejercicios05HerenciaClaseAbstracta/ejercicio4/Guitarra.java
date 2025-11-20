package ejercicios05HerenciaClaseAbstracta.ejercicio4;

public class Guitarra extends InstrumentoMusical{

    private String tipoCuerdas;

    public Guitarra() {
    }

    public Guitarra(String marca, String tipoCuerdas) {
        super(marca);
        this.tipoCuerdas = tipoCuerdas;
    }

    public String getTipoCuerdas() {
        return tipoCuerdas;
    }

    public void setTipoCuerdas(String tipoCuerdas) {
        this.tipoCuerdas = tipoCuerdas;
    }

    @Override
    public String emitirSonido(){
        return "sonido guitarra";
    }
}
