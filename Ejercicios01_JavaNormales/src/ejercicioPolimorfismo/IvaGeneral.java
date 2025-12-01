package ejercicioPolimorfismo;

public class IvaGeneral implements Impuesto{

    @Override
    public double calcularImpuesto() {
        return 0.21; // 21% de IVA general
    }
}
