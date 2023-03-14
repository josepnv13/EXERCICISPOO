interface Volador {
    void volar();
}



class Aguila implements Volador {
    String potMenjar;

    public void volar() {
            System.out.println("la mes rapida del mon");
    }




}
class Periquito implements Volador {
    String potmenjar;
    public void volar() {

        System.out.println("se caga de por. Massa alt");
    }
}
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Aguila aguila = new Aguila();
        Periquito periquito = new Periquito();
        aguila.volar();
        periquito.volar();
    }
}