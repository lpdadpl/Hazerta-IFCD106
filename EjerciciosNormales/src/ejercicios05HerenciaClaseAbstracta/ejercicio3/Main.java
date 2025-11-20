package ejercicios05HerenciaClaseAbstracta.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Cuadrado cPeque = new Cuadrado();
        cPeque.setX(3);
        cPeque.setY(3);
        cPeque.setLado(3);
        Figura cMediano = new Cuadrado(5,5, 5);
        Triangulo tPequenio = new Triangulo();
        tPequenio.setX(10);
        tPequenio.setY(10);
        tPequenio.setBase(3);
        tPequenio.setAltura(3);
        Figura tMediano = new Triangulo();
        tMediano.setX(45);
        tMediano.setY(5);


        Figura[] figuras = { cPeque, cMediano, tMediano, tPequenio };

        for(Figura f : figuras){
            f.calcularArea();
            f.mostrarPosicion();
        }
    }
}
