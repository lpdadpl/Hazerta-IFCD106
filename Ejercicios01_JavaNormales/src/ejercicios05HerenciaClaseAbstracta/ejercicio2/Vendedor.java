package ejercicios05HerenciaClaseAbstracta.ejercicio2;

public class Vendedor extends Empleado{
    private double ventas;
    private  double comision;

    @Override
    public String toString() {
        return "Vendedor{" +
                "ventas=" + ventas +
                ", comision=" + comision +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", porcentaje=" + porcentaje +
                '}';
    }

    public Vendedor() {
    }

    public Vendedor(String nombre, double sueldo, double porcentaje, double ventas, double comision) {
        super(nombre, sueldo, porcentaje);
        this.ventas = ventas;
        this.comision = comision;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public double calcularNomina() {
        double nomina = sueldo * porcentaje + comision;
        System.out.println("La nómina de " + this.nombre + " es de: " + nomina + " €");
        return nomina;
    }
}
