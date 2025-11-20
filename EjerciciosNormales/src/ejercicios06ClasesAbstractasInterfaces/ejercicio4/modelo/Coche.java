package ejercicios06ClasesAbstractasInterfaces.ejercicio4.modelo;

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

    public Coche(String modelo, String matricula) {
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
