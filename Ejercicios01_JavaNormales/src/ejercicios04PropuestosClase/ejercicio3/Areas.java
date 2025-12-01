package ejercicios04PropuestosClase.ejercicio3;

public class Areas {

    private float radio;

    public float calculoAreaCirculo(int Radio){
        radio = Radio;
        float area= (float) (Math.PI * radio *radio);
        System.out.println("El area del circulo de radio "+ radio + " es: "+ area);
        return area;
    }

    private float alto;
    private float ancho;
    public float calculoAreaRectangulo(int Alto, int Ancho){
        alto = Alto;
        ancho = Ancho;
        float area = alto*ancho;
        System.out.println("el area del rectangulo con altura "+Alto+ " y ancho "+Ancho +" es de: "+
                area);
        return area;
    }
}
