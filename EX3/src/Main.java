import java.util.Scanner;

class Ex3{

    int esMesGran(int a, int b){

        if(a>b){
            return -1;
        } else if (a==b) {
            return 0;

        }else {
            return 1;
        }

    }

}


public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        Ex3 ex3= new Ex3();

        int retornar = ex3.esMesGran(n1,n2);

        System.out.println(retornar);

    }
}