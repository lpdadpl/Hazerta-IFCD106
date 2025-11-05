package ejemploexcepciones.fecha;



public class ProbarExcepcion {
    public static void main(String[] args) {
        Fecha f1 = new Fecha();
        try {
            f1.setMes(40);
        } catch (EjemploExcepcionPersonalizada e){
            System.out.println("el mes es incorrecto: " + e.getMessage());
        }
        System.out.println(f1.getMes());
    }
}
