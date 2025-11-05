package ejemploabstracto;

import java.time.LocalDate;

public class ProbarEjemploAbstracto {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("12345678A", "Juan Lopez", LocalDate.of(1992, 8, 30), LocalDate.of(2018, 12, 2), 3500, 500, "recursos humanos", true, 4);
        System.out.println("Calculo de la nomina: "+g1.calcularNomina());

        Vendedor v1 = new Vendedor("23456789B", "Carmen Caballero", LocalDate.of(1992, 8, 21), LocalDate.of(2018, 12, 3), 2500, 400, 5);
        System.out.println("Calculo de la nomina: "+v1.calcularNomina());

        Operador o1 = new Operador("123456789C","Ana Flores",LocalDate.of(1999,01,01),LocalDate.of(2019,01,01),1_500,29,2);
        System.out.println("Calcular nomina -> "+ o1.calcularNomina());

    }
}
