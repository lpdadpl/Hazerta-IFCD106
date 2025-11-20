package ejercicios05HerenciaClaseAbstracta.ejercicio1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProductoPerecedero extends Producto {
    private LocalDate fCaducidad;
    private LocalDate fFabricacion;

    public ProductoPerecedero() {
        super();
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fFabricacion, LocalDate fCaducidad) {
        super(nombre, cantidad, pvp);
        this.fFabricacion = fFabricacion;
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getFCaducidad() {
        return fCaducidad;
    }

    public void setFCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getFFabricacion() {
        return fFabricacion;
    }

    public void setFFabricacion(LocalDate fFabricacion) {
        this.fFabricacion = fFabricacion;
    }

    public int tiempoConsumicion() {
        if (fCaducidad != null && LocalDate.now().isBefore(fCaducidad)) {
            return (int) ChronoUnit.DAYS.between(LocalDate.now(), fCaducidad);
        } else {
            System.out.println("el producto ha caducado");
            return 0;
        }
    }
    public int tiempoFabricacion(){
        if (fFabricacion != null & LocalDate.now().isAfter((fFabricacion))) {
            return (int) ChronoUnit.DAYS.between(fFabricacion, LocalDate.now());
        }else{
            System.out.println("El producto al que hace referencia no ha sido fabricado");
            return 0;
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", ProductoPerecedero {" +
                "fFabricacion=" + fFabricacion +
                ", fCaducidad=" + fCaducidad +
                ", días hasta caducidad=" + tiempoConsumicion() +
                '}';
    }
}
