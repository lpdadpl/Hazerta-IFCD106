package ejemploexcepciones;

public class EjemploExcepciones {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        try {
            numeros[0]= 1;
            numeros[4] = 5;

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("se ha encontrado un error: "+e.toString());
        }
        System.out.println(numeros[0]);
        System.out.println("ultima linea");
    }
}
