package ejercicios04PropuestosClase.ejercicio4;

public class Campos {

    private int x = 0;

    public int mostrar(){
        System.out.println("el valor de x es: "+x);
        return x;
    }
    public void incrementar(){
        x++;
        System.out.println("el valor de x ha incrementado");
    }
}
