package ejemploabstracto;

import java.time.LocalDate;

abstract class Empleado {
    private String dni;
    private String nombre;
    private LocalDate fNacimiento;
    private LocalDate fIngreso;
    protected double sueldo;

    public abstract double calcularNomina();

    public Empleado() {
    }

    public Empleado(String nombre, String dni, LocalDate fNacimiento, LocalDate fIngreso, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.fNacimiento = fNacimiento;
        this.fIngreso = fIngreso;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public LocalDate getfIngreso() {
        return fIngreso;
    }

    public void setfIngreso(LocalDate fIngreso) {
        this.fIngreso = fIngreso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
