import java.util.Scanner;

class Producte {
    String nom;
    int quantitat;


    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }

    Producte mesQuantitat(Producte altreProducte){

        if (this.quantitat > altreProducte.quantitat) {
            return this;
        } else {
            return altreProducte;
        }


    }
}


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomprod = scanner.nextLine();
        int quantp1= scanner.nextInt();

        String bbb= scanner.nextLine();

        String nomprod2 = scanner.nextLine();
        int quantp2= scanner.nextInt();

        Producte producte = new Producte(nomprod,quantp1);
        Producte producte1 = new Producte(nomprod2,quantp2);

        Producte producteMesQuantitat = producte.mesQuantitat(producte1);
        System.out.println("El producte amb més quantitat és " + producteMesQuantitat.nom + " amb " + producteMesQuantitat.quantitat + " unitats.");









    }
}