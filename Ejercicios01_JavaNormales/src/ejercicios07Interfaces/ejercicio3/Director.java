package ejercicios07Interfaces.ejercicio3;

public class Director implements Empleado{

    private Informe informe;

    @Override
    public String toString() {
        return "Director{" +
                "informe=" + informe +
                '}';
    }

    public Director() {
    }

    public Director(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Directear mucho";
    }

    @Override
    public String getInforme() {
        return "hacer  informes categoria Director";
    }
}
