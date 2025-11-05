package hazerta.com.modelo;

public class ProductoLujo extends Producto{
    private float porcentajeIVA = 0.19f;

    public float getPorcentajeIVA(){
        return porcentajeIVA;
    }
    public void setPorcentajeIVA(float porcentajeIVA){
        this.porcentajeIVA = porcentajeIVA;
    }
}
