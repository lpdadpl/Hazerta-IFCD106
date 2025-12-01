package ejercicios07Interfaces.ejercicio1;

public class Conductor {

    private Vehiculo vehiculo;
    private String nombreConductor;


    public Conductor() {
    }

    // Constructor con parámetros
    public Conductor(String nombreConductor, Vehiculo vehiculo) {
        this.nombreConductor = nombreConductor;
        this.vehiculo = vehiculo;
    }

    // Getters
    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public String getNombreConductor() {
        return nombreConductor;
    }

    // Setters
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    //
    @Override
    public String toString() {
        return "Conductor{" +
                "nombreConductor='" + nombreConductor + '\'' +
                ", vehiculo=" + (vehiculo != null ? vehiculo.getNombre() : "ninguno") +
                '}';
    }


    public void moverse() {
        if (vehiculo != null) {
            System.out.println("El conductor " + nombreConductor + " ha movido el coche: " + vehiculo.getNombre());
        } else {
            System.out.println("El conductor " + nombreConductor + " no tiene vehículo asignado.");
        }
    }
}
