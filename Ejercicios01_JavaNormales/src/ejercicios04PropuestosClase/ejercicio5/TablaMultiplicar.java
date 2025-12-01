package ejercicios04PropuestosClase.ejercicio5;

public class TablaMultiplicar {
    private int numero;


    public TablaMultiplicar(int numero) {
        this.numero = numero;
    }

    public String generarTabla() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= 10; i++) {
            sb.append(numero + " x " + i + " = " + (numero * i));
            if (i < 10) sb.append("\n"); // Evitamos salto extra al final
        }

        return sb.toString();
    }

}