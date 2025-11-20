package ejercicios05HerenciaClaseAbstracta.ejercicio4;

abstract class InstrumentoMusical {
    protected String marca;

    public abstract String emitirSonido();


    public InstrumentoMusical() {
    }

    public InstrumentoMusical(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
