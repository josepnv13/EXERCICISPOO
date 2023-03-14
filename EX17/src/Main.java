import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

   class Producte {
    String nom;
    int quantitat;

     static List<Producte> retornar(List<Producte> llistaProductes){

        List<Producte> productesAmbQuantitatInferior = new ArrayList<Producte>();

        for (Producte producte : llistaProductes) {
            if (producte.quantitat < producte.nom.length()) {
                productesAmbQuantitatInferior.add(producte);
            }
        }

        return productesAmbQuantitatInferior;
    }

    public Producte(String nom, int quantitat) {
        this.nom = nom;
        this.quantitat = quantitat;
    }

    public Producte() {
        this.nom = ThreadLocalRandom.current().ints(6, 65, 91)
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
        this.quantitat = ThreadLocalRandom.current().nextInt();
    }

    @Override
    public String toString() {
        return "Producte [nom=" + nom + ", quantitat=" + quantitat + "]";
    }
}

public class Main {
    public static void main(String[] args) {

        Producte producte= new Producte();

        List<Producte> llistaProductes = new ArrayList<Producte>();

        for (int i = 0; i < 1000; i++) {

            llistaProductes.add(producte);
        }

        Producte producteRandom = llistaProductes.get(ThreadLocalRandom.current().nextInt(llistaProductes.size()));
        List<Producte> productesAmbQuantitatInferior = Producte.retornar(llistaProductes);

        System.out.println("Productes amb quantitat inferior a " + producteRandom.quantitat + ":");
        for (Producte producte1: productesAmbQuantitatInferior) {
            System.out.println(producte);
        }

        int igualomes = 0;

        for (Producte producte1 : llistaProductes) {
            if (producte.quantitat >= producte.nom.length()) {
                igualomes++;
            }
        }

        System.out.println("Número de productes amb quantitat superior o igual a la seua: " + igualomes);

        if (producte.quantitat == producte.nom.length()){
            llistaProductes.remove(producte);

        }


    }
}
