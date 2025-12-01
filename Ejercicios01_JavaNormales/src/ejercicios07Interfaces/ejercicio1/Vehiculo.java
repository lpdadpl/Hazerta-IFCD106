package ejercicios07Interfaces.ejercicio1;

public class Vehiculo {

    private String nombre;

    @Override
    public String toString() {
        return "Vehiculo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Vehiculo() {
    }

    public Vehiculo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void moverse(){
        System.out.println(nombre+" se esta moviendo.");
    }
}
