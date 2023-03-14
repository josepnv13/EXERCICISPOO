import java.util.ArrayList;

class Producte {
    String nom;
    int quantitat;


    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }


    @Override
    public String toString() {
        return "Producte [nom=" + nom + ", quantitat=" + quantitat + "]";
    }
}



public class Main {
    public static void main(String[] args) {
        Producte producte = new Producte("aigua",2);
        Producte producte1= new Producte("condons ", 3);
        Producte producte2=new Producte("monster",3);
        Producte producte3=new Producte("kikos",4);

        ArrayList<Producte> listProducts = new ArrayList<Producte>();
        listProducts.add(producte);
        listProducts.add(producte1);
        listProducts.add(producte2);

        for (int i = 0; i <listProducts.size() ; i++) {
            System.out.println(listProducts);

        }
        for (Producte productes:listProducts) {
            System.out.println(listProducts);

        }
        listProducts.add(listProducts.size()/2 , producte3);

        //listProducts.clear();



    }
}