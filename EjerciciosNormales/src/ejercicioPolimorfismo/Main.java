package ejercicioPolimorfismo;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto("Laptop", 800.0);
        Producto p2 = new Producto("Mouse", 25.0);
        Producto p3 = new Producto("Teclado", 45.0);
        Producto p4 = new Producto("Libro", 15.0);


        // Crear factura con IVA general (por defecto)
        Factura facturaGeneral = new Factura( new IvaGeneral());
        facturaGeneral.agregarProducto(p1);
        facturaGeneral.agregarProducto(p2);
        facturaGeneral.agregarProducto(p3);
        
        System.out.println("FACTURA CON IVA GENERAL (21%):");
        System.out.println(facturaGeneral);

        // Crear factura con IVA super reducido
        Factura facturaSuperReducido = new Factura(new IvaSuperReducido());
        facturaSuperReducido.agregarProducto(p4);
        
        System.out.println("FACTURA CON IVA SUPER REDUCIDO (4%):");
        System.out.println(facturaSuperReducido);



    }
}
