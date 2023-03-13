import java.util.Scanner;

class Ex4 {
    String repeteix(int num, String text) {

        if (num<0){
            return  " ";
        }

        return text.repeat(num);
    }

}


public class Ex4Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ex4 ex4 = new Ex4();

        int nnnn = scanner.nextInt();
        String texto = scanner.next();

        String repet = ex4.repeteix(nnnn, texto);

        System.out.println(repet);

    }
}