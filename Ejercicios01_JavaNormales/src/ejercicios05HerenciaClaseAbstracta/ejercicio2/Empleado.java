package ejercicios05HerenciaClaseAbstracta.ejercicio2;

abstract public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected double porcentaje=0.75;

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", porcentaje=" + porcentaje +
                '}';
    }

    public Empleado() {
    }

    public Empleado(String nombre, double sueldo, double porcentaje) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.porcentaje = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public abstract double calcularNomina();

}
