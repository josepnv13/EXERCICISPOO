import java.util.Scanner;

class Targeta {
    String nomClient;
    int numTar;
    int numPIN;
    int creditTotalDisponible;
    int limitCreditDiari;
    int limitCreditDiariConsumit;

    public Targeta(String nomClient, int numTar, int numPIN, int creditTotalDisponible, int limitCreditDiari, int limitCreditDiariConsumit) {
        this.nomClient = nomClient;
        this.numTar = numTar;
        this.numPIN = numPIN;
        this.creditTotalDisponible = creditTotalDisponible;
        this.limitCreditDiari = limitCreditDiari;
        this.limitCreditDiariConsumit = limitCreditDiariConsumit;
    }

    int traureDiners(int quantitat, int numpin) {
        if (numpin != this.numPIN) {
            return 1;
        } else if (quantitat > this.creditTotalDisponible) {
            return 2;
        } else if (quantitat > this.limitCreditDiari - this.limitCreditDiariConsumit) {
            return 3;
        } else {
            this.creditTotalDisponible -= quantitat;
            this.limitCreditDiariConsumit += quantitat;
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Targeta targeta = new Targeta("Joan", 123456, 1899, 10000, 500, 0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("cantitat");

        int retirada = scanner.nextInt();

        System.out.println("pin");

        int pin = scanner.nextInt();



        int codi = targeta.traureDiners(retirada, pin);

        int retornar = targeta.traureDiners(pin,retirada);

        if (retornar==1){
            System.out.println("Mal el puto pin idiota");
        } else if (retornar==2) {
            System.out.println("Que te creus ric pedazo de mierder");

        } else if (retornar==3) {
            System.out.println("massa dines gastats hui en la rule");

        }else {
            System.out.println("tot correcte");
        }


    }
}
