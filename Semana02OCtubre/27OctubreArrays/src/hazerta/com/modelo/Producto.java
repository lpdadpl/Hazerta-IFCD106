package hazerta.com.modelo;

public class Producto
{
    public int numId;
    public String nombre;

    public Producto() {
    }

    public Producto(int numId, String nombre) {
        this.numId = numId;
        this.nombre = nombre;
    }

    public int getNumId() {
        return numId;
    }

    public void setNumId(int numId) {
        this.numId = numId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "numId='" + numId + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
