package ejemplointerface;

public class ProbarInterfaces {
    public static void main(String[] args) {
        Avion a1 = new Avion();
        System.out.println(a1.despegar());
        System.out.println(a1.volar());
        System.out.println(a1.aterrizar());
        Ave a2 = new Ave();
        System.out.println(a2.despegar());
        System.out.println(a2.volar());
        System.out.println(a2.aterrizar());
        Superman s1 = new Superman();
        System.out.println(s1.despegar());
        System.out.println(s1.volar());
        System.out.println(s1.aterrizar());
        HidroAvion ha1 = new HidroAvion();
        System.out.println(ha1.despegar());
        System.out.println(ha1.volar());
        System.out.println(ha1.aterrizar());
        System.out.println(ha1.volar());
        System.out.println(ha1.aterrizar());
        System.out.println(ha1.navegar());
        System.out.println(ha1.atracar());

    }

}
