package ejemplojse55;

public class UsoFiguras {
    public static void main(String[] args) {
        Figura2D figura =  new Circulo(3.2547f);


        System.out.println("el perimetro del circulo es: "+figura.perimetro());
        System.out.println("el area del circulo es: "+figura.area());
    }
}
