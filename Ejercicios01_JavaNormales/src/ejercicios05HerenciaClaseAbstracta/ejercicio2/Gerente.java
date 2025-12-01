package ejercicios05HerenciaClaseAbstracta.ejercicio2;

public class Gerente extends Empleado{
    private double bono;

    @Override
    public String toString() {
        return "Gerente{" +
                "bono=" + bono +
                ", nombre='" + nombre + '\'' +
                ", sueldo=" + sueldo +
                ", porcentaje=" + porcentaje +
                '}';
    }

    public Gerente() {
    }


    public Gerente(String nombre, double sueldo, double porcentaje, double bono) {
        super(nombre, sueldo, porcentaje);
        this.bono = bono;
    }

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public double calcularNomina(){
        double nomina = sueldo*porcentaje+bono;
        System.out.println("la nomina de "+ this.nombre+" es de: "+ nomina+" €");
        return nomina;
    }
}
