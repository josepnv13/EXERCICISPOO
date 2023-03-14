import java.util.Scanner;

class Textinum {
    String lletraEnPosicio(String text, int posicio){
        if (text.length()<posicio){

            return " ";
        } else if (text.length()>=posicio) {

            return Character.toString(text.charAt(posicio - 1));

        }
        return "";
    }




}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        String text = scanner.nextLine();
        int posicio = scanner.nextInt();

        Textinum textinum = new Textinum();

        String lletra = textinum.lletraEnPosicio(text, posicio);
        System.out.println("La lletra en posició " + posicio + " és " + lletra);








    }
}