package ejercicios07Interfaces.ejercicio2;

public class seguroCoche {

    private iTaller taller;
    private String aseguradora;

    public seguroCoche(iTaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public String reparar(Coche coche) {
        return "Seguro " + aseguradora + ": " + taller.reparar(coche);
    }
}
