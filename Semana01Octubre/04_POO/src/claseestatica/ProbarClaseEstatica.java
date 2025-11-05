package claseestatica;

public class ProbarClaseEstatica {
    public static void main(String[] args) {
        System.out.println("1- "+Contador.getContadorGlobal());
        Contador c1 = new Contador();
        System.out.println("2- "+Contador.getContadorGlobal());
        System.out.println("3- "+c1.toString());
        Contador c2 = new Contador();
        System.out.println("4- "+c2.toString());
        System.out.println("5- "+Contador.contadorGlobal);
        System.out.println("6- "+Calculadora.division(10, 2));
    }
}
