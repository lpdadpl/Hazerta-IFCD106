package ejercicios05HerenciaClaseAbstracta.ejercicio3;

public class Cuadrado extends Figura {

    private double lado;

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Cuadrado() {
    }

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        double area = lado*lado;
        System.out.println("el area del cuadrado es: "+area);
        return area;

    }

    @Override
    public String mostrarPosicion(){
        String posicion = "la posicion del cuadrado es "+x +" en el eje x (ordenadas) y "+y+" en la eje y (abscisas)";
        System.out.println(posicion);
        return posicion;
    }
}
