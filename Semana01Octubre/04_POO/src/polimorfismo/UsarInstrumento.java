package polimorfismo;

public class UsarInstrumento {
    public static void main(String[] args) {


        //DOWNCASTIGN
        InstrumentoMusical molon = new Flauta();
        Flauta f2 = (Flauta) molon;
        System.out.println(f2.emitirSonido());

        //UPCASTING
        Guitarra g2=  new Guitarra();
        InstrumentoMusical prueba =(InstrumentoMusical) g2;

    }
}
