package ejemploabstracto;

import java.time.LocalDate;

public class Gerente extends Empleado{
    private double bono;
    private String responsabilidad;
    private boolean derechoCoche;
    private int numTrabajadores;

    public Gerente(){}

    public Gerente(String dni, String nombre, LocalDate fNacimiento, LocalDate fIngreso, double sueldo, double bono, String responsabilidad, boolean derechoCoche, int numTrabajadores) {
        super(dni, nombre, fNacimiento, fIngreso, sueldo);
        this.bono = bono;
        this.responsabilidad = responsabilidad;
        this.derechoCoche = derechoCoche;
        this.numTrabajadores = numTrabajadores;
    }


    @Override
    public double calcularNomina(){
        return sueldo+bono*0.85;
    }




    //setters y getters

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public String getResponsabilidad() {
        return responsabilidad;
    }

    public void setResponsabilidad(String responsabilidad) {
        this.responsabilidad = responsabilidad;
    }

    public boolean isDerechoCoche() {
        return derechoCoche;
    }

    public void setDerechoCoche(boolean derechoCoche) {
        this.derechoCoche = derechoCoche;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }
}
