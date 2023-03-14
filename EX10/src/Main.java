import java.util.Scanner;

class Codigohtml {

    String hyperlink(String url, String text){
        return "<a href=" + url +">"+text+"</a>";
    }


}


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Codigohtml codigohtml= new Codigohtml();

        String url = scanner.nextLine();
        String texto= scanner.nextLine();

        String hyperlink = codigohtml.hyperlink(url,texto);
        System.out.println(hyperlink);



    }
}