package ejercicios05HerenciaClaseAbstracta.ejercicio2;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Fiera Fierez", 5000, 0.75, 1000);
        gerente.calcularNomina();
        

        Vendedor vendedor = new Vendedor("Juan Juanez", 3000, 0.75, 5000, 500);
        vendedor.calcularNomina();

        Operador operador = new Operador( "Paco pacheco", 2000, 0.75, 20, 20 );
        operador.calcularNomina();
    }
}
