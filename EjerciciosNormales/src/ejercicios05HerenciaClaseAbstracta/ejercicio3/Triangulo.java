package ejercicios05HerenciaClaseAbstracta.ejercicio3;

public class Triangulo extends Figura{

    private double base;
    private double altura;

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double area= base*altura;
        System.out.println("el area del tringulo es de: "+area );
        return area;
    }

    @Override
    public String mostrarPosicion(){
        String posicion = "la posicion del triangulo es "+x +" en el eje x (ordenadas) y "+y+" en la eje y (abscisas)";
        System.out.println(posicion);
        return posicion;
    }
}
