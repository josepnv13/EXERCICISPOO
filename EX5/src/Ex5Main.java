import java.util.Scanner;

class Ex5{
    String uneix(String text1, String text2){
        if (text1.length()>text2.length()){
            return text1 + text2;
        } else if (text2.length()>text1.length()) {
            return text2 + text1;
        }else {
            return text1 + text2;
        }
    }



}


public class Ex5Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ex5 ex5 = new Ex5();

        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();

        String resultat = ex5.uneix(text1,text2);

        System.out.println(resultat);



    }
}