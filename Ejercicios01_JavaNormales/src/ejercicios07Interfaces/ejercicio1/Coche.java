package ejercicios07Interfaces.ejercicio1;

public class Coche extends Vehiculo {

    private int deposito;

    @Override
    public String toString() {
        return "Coche{" +
                "deposito=" + deposito +
                '}';
    }

    public Coche() {
    }

    public Coche(String nombre, int deposito) {
        super(nombre);
        this.deposito = deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public void moverse(){
        String nombre = getNombre();
        System.out.println(nombre+" se esta moviendo.");
    }
    
}
