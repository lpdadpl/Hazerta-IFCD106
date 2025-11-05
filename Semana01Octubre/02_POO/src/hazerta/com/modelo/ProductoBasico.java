package hazerta.com.modelo;

public class ProductoBasico extends Producto {
    private float porcentajeIVA = 0.04f;

    public float getPorcentajeIVA(){
        return porcentajeIVA;
    }
    public void setPorcentajeIVA(float porcentajeIVA){
        this.porcentajeIVA = porcentajeIVA;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo()+ " Porcentaje de IVA: " + porcentajeIVA;
    }
    public float calcularIVA(){
        return  getPrecio() * porcentajeIVA;
    }
}

