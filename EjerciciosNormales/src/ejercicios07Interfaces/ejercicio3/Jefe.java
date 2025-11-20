package ejercicios07Interfaces.ejercicio3;

public class Jefe implements Empleado{

    private Informe informe;

    @Override
    public String toString() {
        return "Jefe{" +
                "informe=" + informe +
                '}';
    }

    public Jefe() {
    }

    public Jefe(Informe informe) {
        this.informe = informe;
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    @Override
    public String getTareas() {
        return "Jefear Mucho";
    }

    @Override
    public String getInforme() {
        return "hacer Informes categoria jefe";
    }
}
