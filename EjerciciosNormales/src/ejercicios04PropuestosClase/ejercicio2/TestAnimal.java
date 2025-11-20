package ejercicios04PropuestosClase.ejercicio2;

public class TestAnimal {
    public static void main(String[] args) {
        Animal Perro = new Animal();
        Animal Pez = new Animal();
        Animal Cocodrilo = new Animal();

        System.out.println("-----");

        Perro.setName("Boby");
        Perro.setNoPatas(4);
        Perro.setViviparo(true);
        Perro.toString();
        String sonidoPerro = "guau";
        Perro.emitirSonido(sonidoPerro);
        Perro.caminar();
        Perro.comer();

        System.out.println("-----");

        Pez.setName("Goldey");
        Pez.setNoPatas(0);
        Pez.setViviparo(false);
        Pez.toString();
        String sonidoPez = "blub";
        Pez.emitirSonido(sonidoPez);
        Pez.caminar();
        Pez.comer();

        System.out.println("-----");

        Cocodrilo.setName("Bitey");
        Cocodrilo.setNoPatas(4);
        Cocodrilo.setViviparo(false);
        Cocodrilo.toString();
        String sonidoCocodrilo = "clack clack";
        Cocodrilo.emitirSonido(sonidoCocodrilo);
        Cocodrilo.caminar();
        Cocodrilo.comer();
    }
}
