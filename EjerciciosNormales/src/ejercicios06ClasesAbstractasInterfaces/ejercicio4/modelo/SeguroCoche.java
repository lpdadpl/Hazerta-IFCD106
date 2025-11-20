package ejercicios06ClasesAbstractasInterfaces.ejercicio4.modelo;


import ejercicios06ClasesAbstractasInterfaces.ejercicio4.interfaz.iTaller;

public class SeguroCoche implements iTaller {
    private iTaller taller;
    private String aseguradora;

    @Override
    public String toString() {
        return "SeguroCoche{" +
                "taller=" + taller +
                ", aseguradora='" + aseguradora + '\'' +
                '}';
    }

    public SeguroCoche() {
    }

    public SeguroCoche(iTaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public iTaller getTaller() {
        return taller;
    }

    public void setTaller(iTaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    @Override
    public String repararCoche() {
        return taller.repararCoche();
    }
}
