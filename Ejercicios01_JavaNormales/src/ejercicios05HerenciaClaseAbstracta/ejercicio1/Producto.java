package ejercicios05HerenciaClaseAbstracta.ejercicio1;

 public class Producto {
    protected String nombre;
    protected int cantidad;
    protected double pvp;

    @Override
    public String toString() {
        return "Producto Normal {" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", pvp=" + pvp +
                '}';
    }

    public Producto() {
    }

    public Producto(String nombre, int cantidad, double pvp) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.pvp = pvp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPvp() {
        return pvp;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public double cantidadAPagar(){
        double Precio = cantidad*pvp;
        return Precio;

    }
}
