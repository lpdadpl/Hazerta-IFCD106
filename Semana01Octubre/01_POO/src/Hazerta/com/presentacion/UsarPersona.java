package Hazerta.com.presentacion;

import Hazerta.com.modelo.Persona;
import java.util.Scanner;
public class UsarPersona {
    public static void main(String[] args){
        Persona p1 = new Persona();
        p1.DNI = 12345678;
        p1.nombre = "Alberto";
        p1.direccion = "Calle Recta 1";
        System.out.println(p1.DNI + " " + p1.nombre + " " + p1.direccion);
        Persona p2 = new Persona();
        p2.DNI = 23456789;
        p2.nombre = "Luis";
        p2.direccion = "Calle cortada 2";
        System.out.println(p2.DNI + " " + p2.nombre + " " + p2.direccion);
        Scanner sc = new Scanner(System.in);
        System.out.println("y tus datos cuales son?");
        Persona p3 = new Persona();
        System.out.println("Tu DNI?");
        p3.DNI = sc.nextInt();
        System.out.println("Tu nombre?");
        p3.nombre= sc.next();
        System.out.println("Tu direccion?");
        p3.direccion= sc.nextLine();
        System.out.println(p3.DNI + " " + p3.nombre + " " + p3.direccion);
    }
}
