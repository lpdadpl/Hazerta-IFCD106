    package hazerta.com.modelo;

public class Producto {
    // ATRIBUTOS
    private int idProducto;
    private String nombreProducto;
    private float cantidadExistencia;
    private float precio;

    public Producto() {
    }
    public Producto(int idProducto, String nombreProducto, int cantidadExistencia, int precio) {
    }

    // METODOS
    public String mostrarInfo(){
        return "id: " + idProducto + " nombre: " + nombreProducto + " cantidad: " + cantidadExistencia;
    }
    // SETTER Y GETTER
    //Setter
    public void setIdProducto(int idProducto){
        this.idProducto = idProducto;
    }
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    public void setCantidadExistencia(float cantidadExistencia){
        this.cantidadExistencia = cantidadExistencia;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    //getter
    public int getIdProducto(){
        return idProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }
    public  float getCantidadExistencia(){
        return cantidadExistencia;
    }
    public float getPrecio(){
        return precio;
    }
    //CONSTRUCTORES

}
