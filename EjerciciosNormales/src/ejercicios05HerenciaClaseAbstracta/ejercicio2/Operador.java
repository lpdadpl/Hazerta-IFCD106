package ejercicios05HerenciaClaseAbstracta.ejercicio2;

public class Operador extends Empleado{
    private int piezas;
    private double incentivo;

    public Operador() {
    }

    public Operador(String nombre, double sueldo, double porcentaje, int piezas, double incentivo) {
        super(nombre, sueldo, porcentaje);
        this.piezas = piezas;
        this.incentivo = incentivo;
    }

    @Override
    public String toString() {
        return "Operador{" +
                "piezas=" + piezas +
                ", incentivo=" + incentivo +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", porcentaje=" + porcentaje +
                '}';
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    @Override
    public double calcularNomina() {
        double nomina = sueldo+piezas*incentivo;
        System.out.println("la nomina de "+ this.nombre+" es de: "+ nomina+" €");
        return nomina;
    }
}
