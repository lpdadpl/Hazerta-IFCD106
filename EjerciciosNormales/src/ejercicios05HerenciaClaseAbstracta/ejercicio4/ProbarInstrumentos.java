package ejercicios05HerenciaClaseAbstracta.ejercicio4;

import java.util.ArrayList;

public class ProbarInstrumentos {

    public static void main(String[] args) {
        Guitarra guido =new Guitarra("guido", "Gordas");
        System.out.println(guido.emitirSonido());

        Bateria bataca =new Bateria("bataca", 3);
        System.out.println(bataca.emitirSonido());

        Flauta ham =new Flauta("ham", "Madera");
        System.out.println(ham.emitirSonido());

        InstrumentoMusical molon = new Flauta();
        Flauta f2 = (Flauta) molon;
        InstrumentoMusical prueba = new Guitarra();
        Guitarra g2= (Guitarra) prueba;

        ArrayList<InstrumentoMusical> instrumentos = new ArrayList<>();
        instrumentos.add(guido);
        instrumentos.add(bataca);
        instrumentos.add(ham);
        instrumentos.add(molon);


        for (InstrumentoMusical inst : instrumentos) {
            System.out.println(inst.emitirSonido());
        }
    }
}
