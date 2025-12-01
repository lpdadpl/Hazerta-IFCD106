package ejercicios05HerenciaClaseAbstracta.ejercicio3;

public abstract class Figura {

    protected  int x;
    protected  int y;

    @Override
    public String toString() {
        return "Figura{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Figura() {
    }

    public Figura(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calcularArea(){
        double area= 0;
        return area;
    }

    public String mostrarPosicion(){
        String posicion= "";
        return posicion;
    }

}
