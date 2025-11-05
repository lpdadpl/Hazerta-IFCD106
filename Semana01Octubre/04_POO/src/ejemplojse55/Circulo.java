package ejemplojse55;

public class Circulo implements Figura2D{

    public float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return radio*radio*3.14;
    }

    @Override
    public double perimetro() {
        return radio*2*3.14;
    }
}
