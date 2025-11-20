package ejercicios04PropuestosClase.ejercicio6;



public class Alumno {
    private String nombreCompleto;
    private double[] parciales;


    public Alumno(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[cantidadParciales];
    }


    public void setParcial(int indice, double nota) {
        if (indice >= 0 && indice < parciales.length) {
            parciales[indice] = nota;
        } else {
            System.out.println("Índice de parcial inválido");
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : parciales) {
            suma += nota;
        }
        return suma / parciales.length;
    }


    public void mostrarCalificaciones() {
        System.out.println("Calificaciones de " + nombreCompleto + ":");
        for (int i = 0; i < parciales.length; i++) {
            System.out.println("Parcial " + (i + 1) + ": " + parciales[i]);
        }
    }


    public void mostrarResultadoFinal() {
        mostrarCalificaciones();
        System.out.println("Promedio final: " + calcularPromedio());
    }
}
