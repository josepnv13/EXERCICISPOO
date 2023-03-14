import java.util.ArrayList;

interface Figura{
    float permimetre();
    float area();
    void imprimir();

}
class InventariDeFigures {
    private ArrayList<Figura> figures;

    public InventariDeFigures() {
        figures = new ArrayList<>();
    }

    public void insereixQuadrat(Quadrat q) {
        figures.add(q);
    }
    public void insereixQuadrat(Triangle t) {
        figures.add(t);
    }

    public boolean eliminaQuadrat(int index) {
        Figura f = figures.get(index);
        if (f instanceof Quadrat) {
            figures.remove(index);
            return true;
        } else {
            return false;
        }
    }
}


abstract class Quadrat implements Figura{

    float costat;
    public float perimetre() {
        return 4 * costat;
    }


    public float area() {
        return costat * costat;
    }


    public void imprimir() {
        System.out.println("Quadrat de costat " + costat);
    }

}
abstract class Triangle implements Figura{

    float base;
    float altura;
   // public float perimetre() {
        //no se fela
   // }


    public float area() {
        return (base * altura) / 2;
    }


    public void imprimir() {
        System.out.println("Triangle de base " + base + " + altura " + altura);
    }

}


public class Main {
    public static void main(String[] args) {

        Quadrat quadrat = new Quadrat();
        System.out.println(Quadrat);


    }
}