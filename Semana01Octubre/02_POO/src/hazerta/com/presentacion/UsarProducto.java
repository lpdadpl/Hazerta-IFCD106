package hazerta.com.presentacion;

import hazerta.com.modelo.Producto;
import hazerta.com.modelo.ProductoBasico;

public class UsarProducto {
    public static void main(String[] args) {
        //  INSTANCIAR LA CLASE
        Producto p1 = new Producto();;
        //  INICIALIZACION DE LA CLASE
        p1.setIdProducto(1);
        p1.setNombreProducto("raton");
        p1.setCantidadExistencia(20);

        //  LLAMADA AL METODO
        System.out.println(p1.mostrarInfo());

        Producto p2 = new Producto(3, "Teclado", 15, 15);

        ProductoBasico pb1= new ProductoBasico();
        pb1.setIdProducto(2);
        pb1.setNombreProducto("Zanahorias");
        pb1.setPrecio(0.85f);
        pb1.setCantidadExistencia(30);

        System.out.println(pb1.mostrarInfo());;
        System.out.println(pb1.calcularIVA());
        System.out.println(pb1.calcularIVA());
    }
}
