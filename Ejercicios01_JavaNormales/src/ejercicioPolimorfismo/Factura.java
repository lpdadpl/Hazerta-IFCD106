package ejercicioPolimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Factura implements Impuesto{
    private List<Producto> productos;
    private Impuesto tipoImpuesto;

    public Factura() {

    }

    public Factura(Impuesto tipoImpuesto) {
        this.productos = new ArrayList<>();
        this.tipoImpuesto = tipoImpuesto;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void quitarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularSubtotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    @Override
    public double calcularImpuesto() {
        return calcularSubtotal() * tipoImpuesto.calcularImpuesto();
    }

    public double calcularTotalFactura() {
        return calcularSubtotal() + calcularImpuesto();
    }

    public void setTipoImpuesto(Impuesto tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }

    public Impuesto getTipoImpuesto() {
        return tipoImpuesto;
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos:\n");
        for (Producto producto : productos) {
            sb.append(producto).append("\n");
        }
        sb.append("Subtotal: ").append(String.format("%.2f", calcularSubtotal())).append("€\n");
        sb.append("TOTAL: ").append(String.format("%.2f", calcularTotalFactura())).append("€\n");
        return sb.toString();
    }
}
