package ejercicios04PropuestosClase.ejercicio7;

public class Dado {

    public void dibujar1() {
        System.out.println("+-----+");
        System.out.println("|     |");
        System.out.println("|  •  |");
        System.out.println("|     |");
        System.out.println("+-----+");
    }

    public void dibujar2() {
        System.out.println("+-----+");
        System.out.println("| •   |");
        System.out.println("|     |");
        System.out.println("|   • |");
        System.out.println("+-----+");
    }

    public void dibujar3() {
        System.out.println("+-----+");
        System.out.println("| •   |");
        System.out.println("|  •  |");
        System.out.println("|   • |");
        System.out.println("+-----+");
    }

    public void dibujar4() {
        System.out.println("+-----+");
        System.out.println("| • • |");
        System.out.println("|     |");
        System.out.println("| • • |");
        System.out.println("+-----+");
    }

    public void dibujar5() {
        System.out.println("+-----+");
        System.out.println("| • • |");
        System.out.println("|  •  |");
        System.out.println("| • • |");
        System.out.println("+-----+");
    }

    public void dibujar6() {
        System.out.println("+-----+");
        System.out.println("| • • |");
        System.out.println("| • • |");
        System.out.println("| • • |");
        System.out.println("+-----+");
    }

    public int tirarDado() {
        int valor = (int) (Math.random() * 6) + 1;
        return valor;
    }
}
