package ejercicios04PropuestosClase.ejercicio2;

public class Animal {

 private static String name;
 private boolean viviparo;
 private int noPatas;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", viviparo=" + viviparo +
                ", noPatas=" + noPatas +
                '}';
    }

    public Animal() {
    }

    public Animal(String name, boolean viviparo, int noPatas) {
        this.name = name;
        this.viviparo = viviparo;
        this.noPatas = noPatas;
    }

    public void setNoPatas(int noPatas) {
        this.noPatas = noPatas;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setViviparo(boolean viviparo) {
        this.viviparo = viviparo;
    }

    public void caminar(){
        System.out.println(Animal.name + " esta caminando");
    }

    public void comer(){
        System.out.println(Animal.name + " ha comido");
    }

    public String emitirSonido(String sonido){
        System.out.println(Animal.name +" hace: "+ sonido);
        return sonido;

    }

}
