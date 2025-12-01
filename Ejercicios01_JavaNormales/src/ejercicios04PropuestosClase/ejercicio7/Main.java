package ejercicios04PropuestosClase.ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dado dado = new Dado();

        while (true) {
            eleccion();
            int v1 = sc.nextInt();

            switch (v1) {
                case 1:
                    int valor = dado.tirarDado();
                    switch (valor) {
                        case 1:
                            dado.dibujar1();
                            break;
                        case 2:
                            dado.dibujar2();
                            break;
                        case 3:
                            dado.dibujar3();
                            break;
                        case 4:
                            dado.dibujar4();
                            break;
                        case 5:
                            dado.dibujar5();
                            break;
                        case 6:
                            dado.dibujar6();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("De acuerdo, hasta luego");
                    return; // salimos del programa
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    private static void eleccion() {
        System.out.println("Desea tirar el dado?");
        System.out.println("1 - Si");
        System.out.println("2 - No");
    }
}
