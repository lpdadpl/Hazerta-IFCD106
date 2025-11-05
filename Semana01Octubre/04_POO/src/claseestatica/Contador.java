package claseestatica;

public class Contador {
    public static Integer contadorGlobal = 0;

    private Integer numeroSerie = ++contadorGlobal;

    @Override
    public String toString() {
        return "Contador{" +
                "numeroSerie=" + numeroSerie +
                '}';
    }

    public Contador() {
    }

    public Contador(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public static Integer getContadorGlobal() {
        return contadorGlobal;
    }

    public static void setContadorGlobal(Integer contadorGlobal) {
        Contador.contadorGlobal = contadorGlobal;
    }

    public Integer getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Integer numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
}
