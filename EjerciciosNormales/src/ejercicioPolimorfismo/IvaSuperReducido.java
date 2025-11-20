package ejercicioPolimorfismo;

public class IvaSuperReducido implements Impuesto{

    @Override
    public double calcularImpuesto() {
        return 0.04; // 4% de IVA super reducido
    }
}
