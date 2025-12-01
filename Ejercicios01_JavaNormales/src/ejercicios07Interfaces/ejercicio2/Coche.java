package ejercicios07Interfaces.ejercicio2;

public class Coche {

    private String matricula;
    private String modelo;

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }

    public Coche() {
    }

    public Coche(String matricula, String modelo) {
        this.matricula = matricula;
        this.modelo = modelo;
    }
}
