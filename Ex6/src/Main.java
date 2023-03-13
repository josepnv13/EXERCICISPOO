import java.util.Scanner;

class Ex6 {
    String convertixASetmanes(int dies) {
        if (dies == 7) {
            return "1 setmana";
        } else if (dies % 7 == 0) {
            int resultat = dies / 7;
            return resultat + " semanes";
        } else if (dies < 14 && dies > 7) {
            int resultat1 = dies / 7;
            int resultat = dies % 7;
            return resultat1 + " setmanes " + resultat + " dies";
        } else {
            int resultat1 = dies / 7;
            int resultat = dies % 7;
            return resultat1 + " setmanes " + resultat + " dies";
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diess = scanner.nextInt();

        Ex6 ex6 = new Ex6();

        String tal = ex6.convertixASetmanes(diess);

        System.out.println(tal);
    }
}